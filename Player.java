/** 
 * This class represents a computer!
 * player in the Odd-Even game
 * 
 * Tiffany Neumann
 * tjn2124
 * 10/26/2020
 * 
 * */


public class Player{
    private double t;
    private int score;

    public Player(double threshold){
        t=threshold;
        score=0;
    }     
    //Here the Value() method is called from the game() class and
    //in both versions of the play methods it gets the computer
    //player's moves for each turn they take in both interative and
    //in the computer against computer games. 
    public int Value(){
        int randomValue = 0;
        if (Math.random()>t) { 
            randomValue= 2;
        }
        else{
            randomValue=1;
            }
        return randomValue;
    }
    
    //the add score method gets the winners tokens,
    // it is called from the p1 and p2 objects in the
    // game class it takes explicit parameters,
    //the sum of moves and winners tokens.
    public void addScore(int tokens){
        score = tokens + score;
    }
    //This method calculates the losers tokens. 
    //it takes the sum as an explicit parameter "tokens"  
    //and the players move as a explicit parameter
    //and then sets the sum to score and subtracts 
    //the players tokens from the sum.
    public void subtractScore(int tokens){
        score = (score-tokens); 
    }  
    //this method returns the score to the getP2Score() method and
    //the getP21Score() method
     public int getScore(){       
         return score;
     }
}

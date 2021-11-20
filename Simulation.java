/**
 * This class runs simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not, who has the advantage.
 * 
 * Tiffany Neumann
 * tjn2124
 * Simulation.java, strategy determination 
 * 
 */

//This class works with the game class and the player class
//it creates the game object and calls the computer
//vs computer play method in the game class which calls methods
//from the player class. Here I calulate the best possible 
//possible strategy for t2

public class Simulation{
    
    public static void main(String[] args){
        
        // your code here
        double p1Tokens = 0.0;
        double p2Tokens = 0.0;
        double p1Threshold = 0.0;
        double p2Threshold = 0.0;
        
        double maxMin= 0.0;

        for(double t1=0.01;t1<0.9;t1=t1+0.02)
        {
            double p1MinTokens = 40000.0;
            for(double t2=0.01;t2<0.9;t2=t2+0.02){
                Game g = new Game(t1, t2);
                g.play(100000);
                p1Tokens = g.getP1Score();
                p2Tokens = g.getP2Score();
                if (p1Tokens<p1MinTokens){
                    p1MinTokens = p1Tokens;
                }
            }
            if (maxMin<p1MinTokens){
                maxMin = p1MinTokens;
                p1Threshold = t1;
            }
        }
        System.out.println("maxMin " + maxMin); 
        System.out.println("t1 threshold:" + p1Threshold);
        System.out.println("p1AverageWins "+ (p1Tokens/100000));
        System.out.println("p2AverageWins "+ (p2Tokens/100000));
    }    
}

Tiffany Neumann
tjn2124

Programming Project 3.


PART 1

For part one, in the Game class, I started by creating 3 instance
variables, one for each player and a scanner, since I needed to get the 
human players score. I also instantiated both p1 and p2 in the first game()
method and realized I didn't need p2 in the interative game because I could 
just assign the human player its own variable that only exists within the
play() method for the interative game. Similarly I designed the interative 
play() method to execute the sum and winner and losers tokens all within the 
play() method. In part one I am only using the player class in order to 
set the computer player's move, which is done in the Player class in the Value()
method. I did this because I will also use the Value() method from the Player 
class for part 2. I realized the scores could be kept more simpily inside of
one short and concise method inside the game class which that is why I didn't
use the getp1Score() and getp2Score() for part one. It just seemed simpler to 
do it in the play() method. Also for part one player 1, the human, 
is even player and odd is the computer player. 



PART 2


Game/Player Classes

For part two I instantiated both p1 and p2 because they are both going to have 
their own thresholds and moves which are calculated by calling the player class
methods addScore(int tokens), subtractScore(int tokens), and getScore().
The explicit perameter "tokens" is the same for both the subtract and add 
methods because the are both taking in player tokens which will be mutated in 
those mutator methods. In other words,the sum and player's moves are considered 
tokens so it seemed logical to keep the name tokes for both since tokens is 
merely passing in the values of the players tokens for each turn. In the game 
class, the while loop in the simutation version of the play() method runs 
according to how many games are set to be played in the SimTest class. 
As the while loop  runs and iterates it only outputs either the first if 
statement or the else statement for each iteration of a game depending on
who wins.

Simulation.java

For the second part of the part 2, I made sure to set all instance variables 
as doubles so the percentages came out correctly, versus if they were ints. 
The variable p1Tokens is used to get the p1 average tokens, which I divide by
games played in the end. 
The p1Threshold is used to update the t1 threshold that cooresponds to the
to maxMin tokens. Inside my outer four loop I use p1MinTokens = 40000.0;
to set the p1MinTokens to 40000.0 so that the first iteration
of the inner four loop will execute, and update the p1MinTokens
variable. I use 40000.00, since the p1Tokens will always be less than
40000.0 and then inner if statement in the inner four loop will execute
and then in the preceding iterations the four loop will only update
the p1MinTokens if the tokens in that round of games is less than
p1MinTokens so far. In the outer four loop I used an if statement 
to check if the p1MinTokens is greater than the maxMin so far, 
if so then the maxMin will be updated to the new p1Mintokens
which will give us the maxMin, the best worst case scenario
for p1, and the p1 threshold will updated to the corresponding 
t1 value that produces that result. Once these loops are finished
I found that the best the optimal strategy for p2, is when p1 
plays the game with the threshold of about .59, this is because
this is the absolute best that t1 can do but t2 still has an advantage.
Therefore the game is not fair.



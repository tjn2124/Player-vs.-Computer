Tiffany Neumann
tjn2124
A computer program in Java that allows a user to play this game against a computer. 


Programming Project 3.

PART 1

The computer player has a threshold variable, t. The computer will generate a random
number between 0 and 1. If the number is greater than t the computer will declare “two” 
if the random number is less than t the computer will declare "one". 



PART 2


Game/Player Classes

When a game is instantiated one may specify whether or not it is interactive or simulated.
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



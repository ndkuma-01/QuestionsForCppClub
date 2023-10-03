package Hard;

public class RockPaperScissors {
    /*
    Your test input is two columns of (A,B,C) and (X,Y,Z) repsectively
    This represents a game of rock paper scissors where
      A & X = Rock
      B & Y = Paper
      C & Z = Scissors

      For Part 1:
      Each line represents a game of RPS, and for each game a certain amount of points is gained
      Your total score is the sum of your scores for each round.
      The score for a single round is the score for the shape you selected
      (1 for Rock, 2 for Paper, and 3 for Scissors) plus the score for the outcome
      of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).


    For example lets say you have:
    A Y
    B X
    C Z

    In the first game our opponent plays a Rock (A) and you choose Paper (Y). You win
    so you get 8 points in total (2 points for picking paper and 6 points for winning)
    In the second game our opponent plays Paper (B) and you choose Rock(X). You lose
    so you get 1 point (1 + 0)
    In the third game out opponent plays Scissors (C) and you also play Scissors (Z). You draw
    so you get 3+3=6 points.

    So the total sum of points gained is 8+1+6 = 15


    Index the associated test input and for part 1 return the total sum of points you received



     For Part 2:
     The rules have changed a bit, A,B,C still mean Rock, Paper, and Scissors respectively
     However X,Y,Z mean lose, draw, and win.
     Essentially this says that when you see an X you need to pick the losing play.
     If you see a Y you need to draw
     If you see a Z you need to pick the winning play

     Ex.
     A Y
     B X
     C Z

     For the first one our opponent plays a Rock (A), and we need to draw (Y). So to tie we need to also play Rock
     So we get 3 points for the round ending in a draw and we get 1 point for picking rock = 4 points
     FOr the second one our opponent plays a Paper (X), and we need to lose (X). So we play Rock. This gives us
     1 + 0 = 1
     For the third one our opponent plays Scissors (Z), and we need to win (Z). So we play Rock giving us a score of
     1 + 6 =7

     If we sum our total score is 4 + 1 + 7 = 12.
     Index through the test input and return the sum.




     */


    public static void main(String[] args) {

        System.out.println(p1() == 13052);
        System.out.println(p2() == 13693);
    }

    public static int p1(){
        return 0;
    }

    public static int p2(){
        return 0;
    }



}

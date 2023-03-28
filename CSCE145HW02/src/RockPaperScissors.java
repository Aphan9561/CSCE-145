/*
 * Written by Anna Phan
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        do
        {
            System.out.println("Welcome to Rock Paper Scissor game! \nYour opponent will be the computer. There will be three rounds.");
            int player = 0; //player starts with
            int computer = 0;
            int round = 0;
            while(round < 3)//3 rounds
            {
                System.out.println("Please enter 1 for rock, 2 for paper, or 3 for scissor.");
                int playerMove = keyboard.nextInt();
                int computerMove = r.nextInt((4 - 1)) + 1;
                System.out.println("Computer's move: " + computerMove);

                if (playerMove == computerMove)//when both have the same number
                {
                    System.out.println("Its a tie!");
                    round++;
                }
                else if (playerMove == 1 && computerMove == 3 || playerMove == 2 && computerMove == 1 || playerMove == 3 && computerMove == 2) //all possible wins
                {
                    System.out.println("Player earns a point!!");
                    player++;
                    round++;
                }
                else//if computer has one of the wins above.
                {
                    System.out.println("Computer earns a point!!");
                    computer++;
                    round++;
                }
            }
            System.out.println("END GAME \nPlayer: "+player+"\nComputer: "+computer); //results of the game
            if(player > computer)
            {
                System.out.println("Player wins!!");
            }
            else
            {
                System.out.println("Computer win!!");
            }

            System.out.println("Enter \"true\" to play again. Enter \"false\" to stop");//ask to play again
            playAgain = keyboard.nextBoolean();
        } while(playAgain);
    }
}

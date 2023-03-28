/*
 * Written By Anna Phan
 */
import java.util.Scanner;
import java.util.Random;
public class ChooseYourOwnAdventure {

    public static final int UPPER_NUMBER = 21;
    public static final int RANGE = 20;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secretNumber = 17;
        int num1 = r.nextInt(RANGE);
        int num2 = r.nextInt(RANGE);
        int result = num1 + num2;
        System.out.println("Welcome to the mystery house where you will either find something or die. \nYou are at the front door on the inside of the house and you have three doors. One to your right and two to your left.");
        System.out.println("Do you choose \"door 1\", \"door 2\" or \"door 3\"?");
        String answer = keyboard.nextLine();

        if(answer.equalsIgnoreCase("door 1"))
        {
            System.out.println("You are in the office. You see a safe under the desk. \nDo you try to open the safe or do you look through the cabinets? Enter \"safe\" or \"cabinet\"");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("safe"))
            {
                System.out.println("You see that the safe can be opened by entering in a number between 0 to "+(UPPER_NUMBER-1)+". \nYou get one try. What number do you guess?");
                int guessNumber = 0;
                boolean correctGuess = false;
                while(!correctGuess)
                {
                    guessNumber = keyboard.nextInt();
                    if(guessNumber > secretNumber) //Number Comparison
                    {
                        System.out.println("That's too high. You just set off a bomb. You lose. \nTHE END");
                        System.exit(0);
                    }
                    else if(guessNumber < secretNumber)
                    {
                        System.out.println("That's too low. A tiny trapped door opened underneath you leading to the front lawn. \nTHE END");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("That's correct. You open the safe and there is a treasure map that the owner of the house left behind. \nYou leave the house to find the treasure.");
                        correctGuess = true;
                        System.out.println("THE END");
                    }
                }
            }
            else//cabinet
            {
                System.out.println("You find a bag filled with money and you run out of the house.\nYou open the bag to see that the top is made of $100 bills but when you take the layer of $100, you find that the rest are $1.");
            }
        }
        else if(answer.equalsIgnoreCase("door 2"))
        {
            System.out.println("You are in the kitchen. You are hungry. \nDo you open the \"refrigerator\" or the \"pantry\"?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("refrigerator"))
            {
                System.out.println("Inside there is lasagna. Would you like to eat the food? \"yes\" or \"no\"");
                answer = keyboard.nextLine();
                if(answer.equalsIgnoreCase("yes"))
                {
                    System.out.println("You get a stomachache because the lasagna had mole at the bottom. \nTHE END");
                }
                else if(answer.equalsIgnoreCase("no"))
                {
                    System.out.println("You die of starvation because the kitchen door is now locked and you are trapped inside. \nTHE END");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Your chose is invalid. You lose");
                    System.exit(0);
                }
            }
            else//if the answer is pantry
            {
                System.out.println("Inside there are pop tarts. Would you like to eat them? \"yes\" or \"no\"");
                answer = keyboard.nextLine();
                if(answer.equalsIgnoreCase("yes"))
                {
                    System.out.println("the pop tarts was made out of cardboard and you can't eat it. So now, you're sad. \nTHE END");
                    System.exit(0);
                }
                else if(answer.equalsIgnoreCase("no"))
                {
                    System.out.println("You turn around. There is someone behind you with a gun to your head. \nThey pulled the trigger and now you're dead. \nTHE END");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Your chose is invalid. You lose");
                    System.exit(0);
                }
            }
        }
        else if(answer.equalsIgnoreCase("door 3"))
        {
            System.out.println("You are in another hallway with the stairs are the end. You walk to the end of the hallway. \nTo your left, you see a bedroom. To your right, you see the bathroom. In front of you are the stairs. \nWhich one do you choose? \"stairs\", \"bedroom\", or \"bathroom\"?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("stairs"))
            {
                //similar to the Math Challenge example
                System.out.println("You reach the top of the stairs and you see a door with a pin pad on it. You try to open the door but you find it to be locked. \nA question on the pin pad pops up. What is "+num1+" + "+num2+"?");
                int sum = keyboard.nextInt();
                if(sum == result) //String Comparison
                {
                    System.out.println("That's is correct. You enter the room to find a brand new laptop in the room. \nTHE END");
                }
                else//answer is invalid
                {
                    System.out.println("That is incorrect. You are attacked my bees. \nTHE END");
                    System.exit(0);
                }

            }
            else if(answer.equalsIgnoreCase("bedroom"))
            {
                System.out.println("There is a question on the bedside table. What year is a leap year?");
                answer = keyboard.nextLine();
                int y = Integer.parseInt(answer); //the same as lab 02
                if(((y % 4 == 10) && (y % 100 != 0)) || (y % 400 == 0))//Compound boolean expression. checks to see if the year is a leap year
                {
                    System.out.println("Date is valid. The top drawer open to reveal a key to every room in the house. \nTHE END");
                }
                else// if the year is not a leap year
                {
                    System.out.println("That year is invalid. The bottom drawer opens to show you a date related to your death. \nTHE END");
                }
            }
            else//if the user answered with bathroom
            {
                System.out.println("You walk in and see the mirror has smeared blood on it. \nTHE END");
            }
        }
    }
}

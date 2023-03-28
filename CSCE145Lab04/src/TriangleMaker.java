/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class TriangleMaker {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("I can draw a triangle using (*). \nEnter the size of the triangle."); //tell user to enter
        int height = keyboard.nextInt();

        if(height<=0)//If the number entered is not positive
        {
            System.out.println("That is invalid.");
            System.exit(0);
        }
        for(int i=0; i<=height-1;i++) //tells program to start here
        {
            for(int j=0; j<=i; j++)//will run the loop until it equals height
            {
                System.out.print("*");//print out horizontally with *
            }
            System.out.println();
        }

        for(int i=height-1; i>=0; i--)//will start with number height but -1
        {
            for(int j=0; j<=i-1; j++)//will run until it reaches 0
            {
                System.out.print("*");//print out horizontally with *
            }
            System.out.println();

        }
    }
}

/*
 * Written by Anna Phan
 */
import java.util.Scanner;
import java.util.Random;
public class D6Roll {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the number of times a 6-sided die should be rolled that is greater then 0.");
        int numberInput = keyboard.nextInt();
        int One = 0; //number started is 0
        int Two = 0;
        int Three = 0;
        int Four = 0;
        int Five =0;
        int Six = 0;

        if(numberInput<=0)//number less then 0 is invalid
        {
            System.out.println("That's not valid.");
            System.exit(0);//closes program
        }
        for(int i = 0; i<numberInput;i++)
        {
            int rand = r.nextInt((7 - 1)) + 1; //the range of numbers between 1 to 6
            System.out.println(rand+" was rolled");
            if(rand == 1)
            {
                One++;//adding up the number of 1s that is printed
            }
            if(rand == 2)
            {
                Two++;//adding up the number of 2s that is printed
            }
            if(rand == 3)
            {
                Three++;//adding up the number of 3s that is printed
            }
            if(rand == 4)
            {
                Four++;//adding up the number of 4s that is printed
            }
            if(rand == 5)
            {
                Five++;//adding up the number of 5s that is printed
            }
            if(rand == 6)
            {
                Six++;//adding up the number of 6s that is printed
            }
        }
        System.out.println("One: "+One+"\nTwo: "+Two+"\nThree: "+Three+"\nFour: "+Four+"\nFive: "+Five+"\nSix: "+Six);
    }
}

/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class ABelowAverageWinter {

    public static final int SIZE = 10;//number of inputs
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double[] Temp = new double [SIZE];
        System.out.println("Welcome to the below average temperature tester program.");
        double sum = 0;//sum start
        for(int i= 0;i< Temp.length;i++)
        {
            System.out.println("Please enter the temperature for the day "+(i+1));// i+1 = 0+1 bc i = 0
            double newTemp = keyboard.nextDouble();
            Temp[i] = newTemp;
            sum += Temp[i]; //adding all the temperatures
        }
        double average = sum/SIZE; //averaging the temperatures
        System.out.println("The average temperature was "+average);
        System.out.println("The days that were below average were:");

        for(int i = 0; i< Temp.length;i++)
        {
            if (Temp[i] < average) //if the temperature is less than the average
            {
                System.out.println("Day "+(i+1)+" with "+Temp[i]);//the day and temperature is printed out
            }
        }
    }
}

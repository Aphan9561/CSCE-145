/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class SortingCircles {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to sorting circles. This program will sort the area of each circle ascending and descending order. \nPlease enter how many circles you would like.");
        int size = keyboard.nextInt();
        while(size <= 0)
        {
            System.out.println("That number is invalid. Please enter another number. ");
            size = keyboard.nextInt();
        }
        double [] rad = new double[size];
        for(int i =0;i<rad.length;i++)
        {
            System.out.println("Please enter a radius for circle "+(i+1));
            rad[i] = keyboard.nextDouble(); //Stores the numbers
            rad[i] = Math.abs(rad[i]);//turns negative number to positive
        }

        //Ascending Sorting
        for(int i = 0;i<rad.length;i++)
        {
            int smallestIndex = i;
            for(int j = i+1; j<rad.length ; j++)
            {
                if(rad[j] < rad[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            if(smallestIndex != i)
            {
                //Swap
                double temp = rad[i];
                rad[i] = rad[smallestIndex];
                rad[smallestIndex] = temp;
            }
        }
        System.out.println("Ascending value: ");
        for(int i =0;i<rad.length;i++)
        {
            double area = Math.PI*(rad[i]*rad[i]);//calculating the area
            System.out.println(area);//prints the areas
        }

        //Descending Sorting
        for(int i = 0;i<rad.length;i++)
        {
            int smallestIndex = i;
            for(int j = i+1; j<rad.length ; j++)
            {
                if(rad[j] > rad[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            if(smallestIndex != i)
            {
                //Swap
                double temp = rad[i];
                rad[i] = rad[smallestIndex];
                rad[smallestIndex] = temp;
            }
        }
        System.out.println("\nDescending value: ");
        for(int i =0;i<rad.length;i++)
        {
            double area = Math.PI*(rad[i]*rad[i]); //calculating the area
            System.out.println(area);//prints the areas
        }
    }
}

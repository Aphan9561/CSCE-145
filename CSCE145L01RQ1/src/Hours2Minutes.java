/*
* Written by Anna Phan
*/
import java.util.Scanner;
public class Hours2Minutes {

    public static final double Hours2Minutes = 60.0;
    //Entry Point
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of hours to convert to minutes.");
        double hours;
        hours = keyboard.nextDouble();
        keyboard.nextLine();

        double minutes = hours*Hours2Minutes;

        System.out.println("There are "+minutes+" minutes in "+hours+" hours");
    }

}

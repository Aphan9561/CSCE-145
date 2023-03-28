/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class CoffeeTester {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        while(!quit)
        {
            System.out.println("Welcome. \nWhat's the name of the first coffee?");
            String E1 = keyboard.nextLine();
            System.out.println("What's the caffeine content?");
            double C1 = keyboard.nextDouble();
            keyboard.nextLine();
            Coffee coffee01 = new Coffee();
            coffee01.setName(E1);//Saving the name as what the user has inputted
            coffee01.setCaffeine(C1);//saving the caffeine content that the user inputted

            System.out.println("What's the name of the second coffee?");
            String E2 = keyboard.nextLine();
            System.out.println("What's the caffeine content?");
            double C2 = keyboard.nextDouble();
            keyboard.nextLine();
            Coffee coffee02 = new Coffee();
            coffee02.setName(E2);
            coffee02.setCaffeine(C2);

            System.out.println("It would takes " + coffee01.riskyAmount(coffee01) + " " + E1 + " coffees before it's dangerous to drink more.");
            System.out.println("It would takes " + coffee02.riskyAmount(coffee02) + " " + E2 + " coffees before it's dangerous to drink more.");

            System.out.println("Are they the same properties in both name and caffeine content?");
            System.out.println(coffee01.equals(coffee02));

            System.out.println("\nWould you like to exit? Type \"quit\" to exit or press [ENTER] to continue.");
            quit = keyboard.nextLine().equalsIgnoreCase("quit");
        }
        System.out.println("Goodbye.");
    }
}

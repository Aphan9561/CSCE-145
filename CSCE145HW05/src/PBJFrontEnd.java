/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class PBJFrontEnd {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        while(!quit)
        {
            System.out.println("---------------------------------\nWelcome to the PBJ Sandwich Maker!\n---------------------------------");
            //Sandwich 1 & Top bread information
            System.out.println("-----Sandwich 1-----\nTop Slice of Bread Information\nEnter the name of the bread");
            String TS1N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int TS1C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"Whole Wheat\", \"White\", or \"Whole Grain\"");
            String TS1T = keyboard.nextLine();
            //Peanut Butter Information
            System.out.println("Peanut Butter Information\nEnter the name of peanut butter");
            String PB1N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int PB1C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Is it crunchy? Enter \"true\" or \"false\"");
            boolean isC1 = keyboard.hasNextBoolean();
            keyboard.nextLine();
            //Jelly information
            System.out.println("Jelly Information\nEnter the name of jelly");
            String J1N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int J1C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of jelly. Must be \"Apple\", \"Blackberry\", \"Grape\", \"Mango\", or \"Tomato\"");
            String J1T = keyboard.nextLine();
            //Bottom bread information
            System.out.println("Bottom Slice of Bread Information\nEnter the name of the bread");
            String BS1N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int BS1C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"Whole Wheat\", \"White\", or \"Whole Grain\"");
            String BS1T = keyboard.nextLine();

            PBJSandwich PBJS1 = new PBJSandwich(new Bread(TS1N,TS1C,TS1T),new PeanutButter(PB1N,PB1C,isC1),new Jelly(J1N,J1C,J1T), new Bread(BS1N,BS1C,BS1T));

            //Sandwich 2 & Top bread information
            System.out.println("-----Sandwich 2-----\nTop Slice of Bread Information\nEnter the name of the bread");
            String TS2N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int TS2C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"Whole Wheat\", \"White\", or \"Whole Grain\"");
            String TS2T = keyboard.nextLine();
            //Peanut Butter Information
            System.out.println("Peanut Butter Information\nEnter the name of peanut butter");
            String PB2N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int PB2C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Is it crunchy? Enter \"true\" or \"false\"");
            boolean isC2 = keyboard.hasNextBoolean();
            keyboard.nextLine();
            //Jelly information
            System.out.println("Jelly Information\nEnter the name of jelly");
            String J2N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int J2C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of jelly. Must be \"Apple\", \"Blackberry\", \"Grape\", \"Mango\", or \"Tomato\"");
            String J2T = keyboard.nextLine();
            //Bottom bread information
            System.out.println("Bottom Slice of Bread Information\nEnter the name of the bread");
            String BS2N = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            int BS2C = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"Whole Wheat\", \"White\", or \"Whole Grain\"");
            String BS2T = keyboard.nextLine();

            PBJSandwich PBJS2 = new PBJSandwich(new Bread(TS2N,TS2C,TS2T),new PeanutButter(PB2N,PB2C,isC2),new Jelly(J2N,J2C,J2T), new Bread(BS2N,BS2C,BS2T));

            //Printing out the sandwiches
            System.out.println("-----Sandwich 1-----\n"+ PBJS1);
            System.out.println("-----Sandwich 2-----\n"+ PBJS2);

            System.out.println("\nAre the two sandwiches the same? "+PBJS1.equals(PBJS2));//comparing if the sandwiches are the same

            System.out.println("\nWould you like to run the simulation again? True or False?");
            quit = !keyboard.nextBoolean();
        }
        System.out.println("Goodbye!");
    }
}

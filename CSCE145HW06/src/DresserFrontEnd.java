/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class DresserFrontEnd {
    private static Scanner keyboard = new Scanner(System.in);
    private static Dresser dresser = new Dresser();
    public static void main(String[] args) {
        System.out.println("Welcome to the dresser!");
        boolean quit = false;
        while(!quit)
        {
            printChoices();
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch(choice)
            {
                case 1:
                    addClothing();
                    break;
                case 2:
                    removeClothing();
                    break;
                case 9:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            dresser.printClothing();
        }
        System.out.println("Goodbye!");
    }
    public static void printChoices()
    {
        System.out.println("Enter 1 to add clothes to the dresser \n"
                +"Enter 2 to remove clothes from the dresser \n"
                +"Enter 9 to quit");
    }
    public static void addClothing()
    {
        System.out.println("Enter the type \nIt may be undergarment, socks, stockings, top, bottom, or cape.");
        String type = keyboard.nextLine();
        System.out.println("Enter the color \nIt may be brown, red, pink, black, white, orange, green, blue, purple, or grey");
        String color = keyboard.nextLine();
        dresser.addClothing(new Clothing(type,color));
    }
    public static void removeClothing()
    {
        System.out.println("Enter the type \nIt may be undergarment, socks, stockings, top, bottom, or cape.");
        String type = keyboard.nextLine();
        System.out.println("Enter the color \nIt may be brown, red, pink, black, white, orange, green, blue, purple, or grey");
        String color = keyboard.nextLine();
        dresser.removeClothing(new Clothing(type,color));
    }
}

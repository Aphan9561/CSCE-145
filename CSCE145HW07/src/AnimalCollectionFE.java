/*
 * Written By Anna Phan
 */
import java.util.Scanner;
public class AnimalCollectionFE {
    private static Scanner keyboard = new Scanner(System.in);
    private static AnimalCollection aCollection = new AnimalCollection();
    public static void main(String[] args){
        System.out.println("Welcome to the Cat and Dog Collection!");
        boolean quit = false;
        while(!quit)
        {
            printOptions();
            int answer = keyboard.nextInt();
            keyboard.nextLine();
            switch(answer)
            {
                case 1:
                    aCollection.addAnimal(dialogue());
                    break;
                case 2:
                    removeAnimal();
                    break;
                case 3:
                    aCollection.printAnimals();
                    break;
                case 9:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println("Goodbye");
    }
    //Displays the options to the user
    public static void printOptions()
    {
        System.out.println("Enter 1 to add a cat or dog\nEnter 2 to remove a cat or dog\nEnter 3 to print collection \nEnter 9 to quit ");
    }
    public static Animal dialogue()
    {
        Animal anA;
        int answer = 0;
        System.out.println("Enter 1 for House Cat\nEnter 2 for a Leopard\nEnter 3 for Domestic Dog\nEnter 4 for a Wolf");
        answer = keyboard.nextInt();
        keyboard.nextLine();
        while(answer != 1 && answer != 2 && answer != 3 && answer != 4)
        {
            System.out.println("Invalid choice pick again");
            answer = keyboard.nextInt();
            keyboard.nextLine();
        }
        System.out.println("Enter a name");
        String N = keyboard.nextLine();
        System.out.println("Enter weight");
        double W = keyboard.nextDouble();
        keyboard.nextLine();

        switch(answer)
        {
            case 1: //House Cat
                System.out.println("Enter the mood of the cat. Must be \"sleepy\", \"hunger\", or \"playful\"");
                String M = keyboard.nextLine();
                System.out.println("Enter type of cat. Must be \"ragdoll\", \"short hair\", \"sphinx\", or \"scottish fold\".");
                String CT = keyboard.nextLine();
                anA = new HouseCat(N,W,M,CT);
                break;
            case 2: //Leopard
                System.out.println("Enter the mood of the cat. Must be \"sleepy\", \"hunger\", or \"playful\"");
                String M2 = keyboard.nextLine();
                System.out.println("Enter number of spots");
                int S = keyboard.nextInt();
                keyboard.nextLine();
                anA = new Leopard(N,W,M2,S);
                break;
            case 3: //Domestic Dog
                System.out.println("Enter energy level for dog between 0 and 100");
                int EL = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Enter type of dog. Must be \"husky\", \"mutt\", \"terrier\", or \"retriever\"");
                String DT = keyboard.nextLine();
                anA = new DomesticDog(N,W,EL,DT);
                break;
            case 4: //Wolf
                System.out.println("Enter energy level for dog between 0 and 100");
                int EL2 = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Enter in Pack leader name.");
                String PLN = keyboard.nextLine();
                anA = new Wolf(N,W,EL2,PLN);
                break;
            default:
                anA = new Animal(N,W);
        }
        return anA;
    }
    //Asks the user for the animal;s names
    public static void removeAnimal()
    {
        System.out.println("Enter the name of the animal");
        String name = keyboard.nextLine();
        aCollection.removeAnimals(name);
    }
}

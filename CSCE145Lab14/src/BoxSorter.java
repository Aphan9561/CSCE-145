/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class BoxSorter {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Box Sorter!");
        boolean quit = false;
        while(!quit)
        {
            System.out.println("Enter the number of boxes you would like to sort or -1 to quit the program.");
            int size = keyboard.nextInt();
            System.out.println("Enter the information about boxes and I'll sort them.");
            Box[] boxes = new Box[size];
            if(size == -1)
            {
                System.out.println("Aw goodbye.");
                System.exit(0);
            }
            for(int i =0;i<boxes.length;i++)
            {
                System.out.println("Enter the label, length, width, and height (all feet) of box "+(i+1));
                boxes [i] = new Box(keyboard.next(),
                        keyboard.nextDouble(),
                        keyboard.nextDouble(),
                        keyboard.nextDouble());
                boxes[i].getVolume();
            }

            boolean swapped = true;
            while(swapped)
            {
                swapped = false;
                for(int i = 0;i<boxes.length-1;i++)
                {
                    if(boxes[i] == null || boxes[i+1] == null)
                        break;
                    if (boxes[i].getVolume() > boxes[i+1].getVolume())
                    {
                        Box temp = boxes[i];
                        boxes[i] = boxes[i+1];
                        boxes[i+1] = temp;
                        swapped = true;
                    }
                }
            }

            System.out.println("Sorted Boxes");

            for(Box box: boxes)
            {
                System.out.println(box);
            }

            System.out.println("\nWould you like to run the simulation again? True or False?");
            quit = !keyboard.nextBoolean();

        }
        System.out.println("Goodbye!");
    }

}

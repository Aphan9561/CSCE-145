/*
 * Written by Anna Phan
 */
import java.util.Scanner;
import java.util.Random;
public class MatrixFlippedHorizontally {

    public static final int SIZE = 10;//the size of the matrix
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Created matrix");
        int [][] matrix = new int[SIZE][SIZE];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[i].length;j++)
            {
                //Creating the matrix
                int rand = r.nextInt(10);//Random numbers til 9 because counting starts at 0
                matrix[i][j] = rand;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix flipped horizontally");
        for(int i =0; i<SIZE;i++)
        {
            for(int j=0;j<SIZE/2;j++)
            {
                //Swapping the width
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][SIZE-1-j];//making sure the the number are swapped to look horizontal
                matrix[i][SIZE-1-j] = temp;
            }
        }
        for(int i =0;i< matrix.length;i++)
        {
            for(int j = 0;j< matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");//printing out the flipped matrix
            }
            System.out.println();
        }
    }
}

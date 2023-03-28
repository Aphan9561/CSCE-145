/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the matrix adder program! \nPlease enter the length and width of the first matrix.");
        int L1 = keyboard.nextInt();
        int W1 = keyboard.nextInt();
        int [][] a = new int[L1][W1];
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j<a[i].length;j++)
            {
                System.out.println("Enter value at index "+i+" "+j);
                a[i][j] = keyboard.nextInt();
            }
        }
        //information about the second matrix
        System.out.println("\nPlease enter length and width for the second matrix.");
        int L2 = keyboard.nextInt();
        int W2 = keyboard.nextInt();
        int[][] b = new int [L2][W2];
        for(int i =0;i<b.length;i++)
        {
            for(int j = 0;j<b[i].length;j++)
            {
                System.out.println("Enter value at index "+i+" "+j);
                b[i][j] = keyboard.nextInt();
            }
        }

        if(L1 != L2 || W1 != W2)//if the matrix aren't the same size
        {
            System.out.println("Invalid Dimensions. These cannot be added");
        }
        else//if they are
        {
            int [][] c = new int [L2][W2];
            //printing out the first matrix
            for(int i =0;i<a.length;i++)
            {
                for(int j = 0;j<a[i].length;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("+");
            //printing out the second matrix
            for(int i =0;i<b.length;i++)
            {
                for(int j = 0;j<b[i].length;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("=");
            //Adding both matrices
            for(int i = 0; i<L1; i++)
            {
                for(int j = 0; j<W2;j++)
                {
                    for(int k =0; k<W1;k++)
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            //Printing out the sum of the matrices
            for(int i =0;i<c.length;i++)
            {
                for(int j = 0;j<c[i].length;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

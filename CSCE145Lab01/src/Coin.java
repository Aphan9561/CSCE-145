/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class Coin {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter whole number from 1 to 99. The machine will determine a combination of coins.");
        int c = keyboard.nextInt(); //c is coin or the amount that is entered
        int b = c;
        int quarters = (c/25);
        c = c % 25;
        int dimes = c/10;
        c = c % 10;
        int nickels = c/5;
        c = c % 5;
        int pennies = c/1;
        c = c % 1;
        System.out.println(b+" cents in coins:");
        System.out.println("quarter: "+quarters);
        System.out.println("dimes: "+dimes);
        System.out.println("nickels: "+nickels);
        System.out.println("pennies: "+pennies);
    }
}

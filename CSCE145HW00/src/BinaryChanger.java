/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class BinaryChanger {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first binary number"); //getting first binary number from user
        int BN1 = keyboard.nextInt();
        int B1 = BN1;//first binary number

        System.out.println("Enter second binary number");//getting second binary number from user
        int BN2 = keyboard.nextInt();
        int B2 = BN2;//second binary number

        int decimal = 0;
        int power = 0;

        int decimal2 = 0;
        int power2 = 0;

        while(true)
        {
            if(B1 == 0 || B2 == 0)
            {
                break;
            }
            else
            {
                int tmp = B1%10;
                decimal +=tmp*Math.pow(2,power);
                B1 = B1/10;
                power++; //First Binary Number converted to decimal

                int tmp2 = B2%10;
                decimal2 +=tmp2*Math.pow(2,power2);
                B2 = B2/10;
                power2++;//Second Binary converted to decimal

            }
        }
        int answer = decimal + decimal2;//Adding the decimal together
        System.out.println("Decimal 1 = "+decimal);
        System.out.println("Decimal 2 = "+decimal2);
        System.out.println(decimal+" + "+decimal2+" = "+answer);

    }

}

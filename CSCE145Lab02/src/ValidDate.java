/*
 * Anna Phan
 */
import java.util.Scanner;
public class ValidDate {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date in mm/dd/yyyy format");
        String date = keyboard.nextLine();
        int m = Integer.parseInt(date.substring(0,2));
        int d = Integer.parseInt(date.substring(3,5));
        int y = Integer.parseInt(date.substring(6));

        if(y > 1900 || y < 9999)
        {
            if(m > 1 || m < 12)
            {
                if(m == 02)//Month is February
                {
                    if(d > 0 && d < 30)//the date range is between 0 and 30 meaning date CANNOT be 0 or 30
                    {
                        if(((y % 4 == 10) && (y % 100 != 0)) || (y % 400 == 0))
                        {
                            if(d<=29)//For the leap year
                            {
                                System.out.println("Date is valid!");
                            }
                        }
                        else if(d<=28)
                        {
                            System.out.println("Date is valid!");
                        }
                        else
                        {
                            System.out.println("Date is invalid. Date given is not a leap year.");
                        }
                    }
                }
                else if(m == 4 || m == 6 || m == 9 || m == 11)//Months: April, June, September, November
                {
                    if(d > 0 && d < 31) //the date range is between 0 and 31 meaning date CANNOT be 0 or 31
                    {
                        System.out.println("Date is valid!");
                    }
                    else
                    {
                        System.out.println("Date is invalid. The day for this month. Must be between 1 and 30.");
                    }
                }
                else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)//Months: January, March, May, July, August, October, December
                {
                    if(d > 0 && d < 32)//the date range is between 0 and 32 meaning date CANNOT be 0 or 32
                    {
                        System.out.println("Date is valid!");
                    }
                    else
                    {
                        System.out.println("Date is invalid. Day needs to be between 1 to 31.");
                    }
                }
                else
                {
                    System.out.println("Date is invalid.");
                }
            }
            else
            {
                System.out.println("Date is invalid. Month needs to be between 1 to 12");
            }
        }
        else
        {
            System.out.println("Date is invalid. Year needs to be between 1900 to 9999");
        }

    }
}
/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class DateAndTimeTester {
    //Instance Variables
    private int MM;
    private int DD;
    private int hh;
    private int mm;

    public void run()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        while(!quit)
        {
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid.");
            String dt = keyboard.nextLine();
            boolean valid = isValid(dt);
            if (!valid)
            {
                System.out.println("The date and time is not valid.");
            }
            else
            {
                System.out.println("The date and time is valid");
            }

            System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue.");
            quit = keyboard.nextLine().equalsIgnoreCase("quit");
        }
        System.out.println("Goodbye!");
    }

    //Checking the date and time
    public boolean isValid(String MMDDhhmm)
    {
        int index = MMDDhhmm.indexOf(" ");
        String date = MMDDhhmm.substring(0,index);
        String time = MMDDhhmm.substring(index+1, MMDDhhmm.length());
        boolean valid = isValidDate(date) && isValidTime(time);
        return valid;
    }

    public boolean isValidDate(String str)
    {
        MM = getMonth(str);
        DD = getDay(str);
        //Checking the date
        if(MM<1||MM>12)
        {
            return false;
        }
        else if(MM == 4|| MM == 6 || MM == 9 || MM == 11)
        {
            return (DD<=30);
        }
        else if(MM == 2)
        {
            return (DD<=28);
        }
        else
        {
            return (DD<=31);
        }
    }
    public boolean isValidTime(String str)
    {
        hh = getHour(str);
        mm = getMinute(str);
        //checking the hours
        if(hh<1||hh>12)
        {
            return false;
        }
        else
        {
            return (mm<=59);
        }
    }
    //Accessors
    public int getMonth(String str)
    {
        int index = str.indexOf("/");
        String MM = str.substring(0,index);
        return Integer.parseInt(MM);
    }
    public int getDay(String str)
    {
        int index1 = str.indexOf(" ");
        String DD = str.substring(str.indexOf("/")+1);
        return Integer.parseInt(DD);
    }
    public int getHour(String str)
    {
        int index2 = str.indexOf(":");
        String hh = str.substring(0,index2);
        return Integer.parseInt(hh);
    }
    public int getMinute(String str)
    {
        String mm = str.substring(str.indexOf(":")+1);
        return Integer.parseInt(mm);
    }
}

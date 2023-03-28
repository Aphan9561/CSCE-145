/*
 * Written by Anna Phan
 */
import java.util.Scanner;
public class VowelCounterAndSorter {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the vowel counter and sorter! \nEnter a phrase!");
        String phrase = keyboard.nextLine();
        int [] total = new int[5];//storing the number of the 5 vowels
        char [] vowels = {'a','e','i','o','u'};

        for(int i = 0; i<phrase.length();i++)//this is totaling up the vowels
        {
            char ch = phrase.charAt(i);
            if(ch =='a' ||ch == 'A')//if there is an a, then the program will add it
            {
                total[0]++;
            }
            if(ch =='e' ||ch == 'E')//if there is an e, then the program will add it
            {
                total[1]++;
            }
            if(ch == 'i' || ch == 'I')//if there is an i, then the program will add it
            {
                total[2]++;
            }
            if(ch == 'o' || ch == 'O')//if there is an o, then the program will add it
            {
                total[3]++;
            }
            if(ch == 'u' || ch == 'U')//if there is an u, then the program will add it
            {
                total[4]++;
            }
        }

        //Sorting
        int temp = 0;
        char temp2;
        for(int i =0; i<total.length;i++)
        {
            for(int j =i+1; j<total.length;j++)
            {
                if(total[i] > total[j])
                {
                    temp = total[i];//equal to the total of vowels
                    temp2 = vowels[i];//equal the different vowels
                    total[i] = total[j];
                    vowels[i] = vowels[j];
                    total[j] = temp;
                    vowels[j] = temp2;
                }
            }
        }

        System.out.println("The vowels and their count are");
        for(int i=0;i<total.length;i++)
        {
            System.out.println(vowels[i]+ ":" +total[i]);
        }
    }
}

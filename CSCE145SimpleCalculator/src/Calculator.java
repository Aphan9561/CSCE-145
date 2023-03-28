/*
 * Written by Anna Phan
 */
import java.util.Scanner;

public class Calculator
{
    private double result;
    public static final double PRECISION = 0.0001;

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println("Welcome to the Calculator");
        System.out.print("Format for each line: ");
        System.out.println("<<operator>> <<number>>");
        System.out.println("For example: + 3");
        System.out.println("To quit, enter the letter e.");
        calc.runCalculator();
        System.out.println("Goodbye");
    }
    public void runCalculator()
    {
        Scanner keyboard = new Scanner(System.in);

        boolean done = false;
        result = 0.0;
        System.out.println("result: "+result);
        while(!done)
        {
            char nextOp = (keyboard.next()).charAt(0);
            if((nextOp == 'e') || (nextOp == 'E'))
                done = true;
            else
            {
                try
                {
                    double nextNumber = keyboard.nextDouble();
                    result = evaluate(nextOp,result,nextNumber);
                    System.out.println("result "+nextOp+" "+nextNumber);
                }
                catch(DivideByZeroException e)
                {
                    e.printStackTrace();
                }
                catch(UnknownOpException e)
                {
                    e.printStackTrace();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    keyboard.nextLine();
                    System.out.println("result = "+result);
                }
            }
        }
    }
    public double evaluate(char op, double n1, double n2)
    throws DivideByZeroException,UnknownOpException
    {
        double answer = 0.0;
        switch(op)
        {
            case '+':
                answer = n1 + n2;
                break;
            case'-':
                answer = n1 - n2;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                if((PRECISION<n2) && (n2<PRECISION))
                    throw new DivideByZeroException();
                answer = n1/n2;
                break;
            default:
                throw new UnknownOpException();
        }
        return answer;
    }
    
}

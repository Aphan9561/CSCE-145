/*
 * Written by Anna Phan
 */
public class DivideByZeroException extends Exception
{
    public DivideByZeroException()
    {
        super("Dividing by Zero");
    }
    public DivideByZeroException(String msg)
    {
        super(msg);
    }
}

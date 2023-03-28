/*
 * Written by Anna Phan
 */
public class UnknownOpException extends Exception
{
    public UnknownOpException()
    {
        super("Try using an unknown operator");
    }
    public UnknownOpException(String msg)
    {
        super(msg);
    }
}

/*
 * Written by Anna Phan
 */
public class CheckeredRectangle extends BasicRectangle
{
    public CheckeredRectangle()
    {
        super();
    }
    public CheckeredRectangle(int aH, int aL, int aW)
    {
        super(aH, aL, aW);
    }
    public void drawShape()
    {
        for(int i=0;i<super.getLength();i++)
        {
            for(int j=0;j<super.getWidth();j++)
            {
                if((j+i) % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
 * Written by Anna Phan
 */
public class HollowRectangle extends BasicRectangle
{

    public HollowRectangle()
    {
        super();
    }
    public HollowRectangle(int aH, int aL, int aW)
    {
        super(aH, aL, aW);
    }
    public void drawShape()
    {
        drawLine();
        drawSides();
        drawLine();
    }
    public void drawLine()
    {
        skipSpaces(super.getHSpace());
        for(int i=0; i<super.getWidth();i++)
            System.out.print("*");
        System.out.println();
    }
    public void drawSides()
    {
        for(int i=0;i<super.getLength()-2;i++)
        {
            skipSpaces(super.getHSpace());
            System.out.print("*");
            skipSpaces(super.getWidth()-2);
            System.out.print("*");
            System.out.println();
        }
    }
}

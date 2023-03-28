/*
 * Written by Anna Phan
 */
public class UpsideDownTriangle extends BasicTriangle{
    public UpsideDownTriangle()
    {
        super();
    }
    public UpsideDownTriangle(int aH, int aHe)
    {
        super(aH, aHe);
    }
    public void drawShape()
    {
        for(int i=0;i<super.getHeight();i++)
        {
            skipSpaces(super.getHSpace());
            for(int j=i;j<super.getHeight();j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

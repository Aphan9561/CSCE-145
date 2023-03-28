/*
 * Written by Anna Phan
 */
public class HollowTriangle extends BasicTriangle {
    public HollowTriangle()
    {
        super();
    }
    public HollowTriangle(int aH, int aHe)
    {
        super(aH, aHe);
    }
    public void drawShape()
    {
        //Top point
        skipSpaces(super.getHSpace());
        System.out.println("*");
        int innerSpaces = 0;
        for(int i=0;i<super.getHeight()-2;i++)
        {
            skipSpaces(super.getHSpace());
            System.out.print("*");
            skipSpaces(innerSpaces);
            innerSpaces++;
            System.out.println("*");
        }
        //bottom point
        skipSpaces(super.getHSpace());
        for(int i=0;i<super.getHeight();i++)
            System.out.print("*");
        System.out.println();
    }
}

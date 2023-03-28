/*
 * Written by Anna Phan
 */
public class BasicRectangle extends BasicShape implements Rectangle
{
    private int length;
    private int width;

    public BasicRectangle()
    {
        super();
        this.length = this.width = 1;
    }
    public BasicRectangle(int aH, int aL, int aW)
    {
        super(aH);
        this.setWidth(aW);
        this.setLength(aL);
    }
    public int getWidth()
    {
        return this.width;
    }
    public int getLength()
    {
        return this.length;
    }
    public void setWidth(int aW)
    {
        if(aW >= 1)
            this.width = aW;
        else
            this.width = 1;
    }
    public void setLength(int aL)
    {
        if(aL >= 1)
            this.length = aL;
        else
            this.length = 1;
    }
    public void drawShape()
    {
        for(int i = 0;i<this.length;i++)
        {
            skipSpaces(super.getHSpace());
            for(int j=0;j<this.width;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

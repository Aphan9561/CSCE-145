/*
 * Written by Anna Phan
 */
public class BasicTriangle extends BasicShape implements Triangle{
    private int height;
    public BasicTriangle()
    {
        super();
        this.height = 1;
    }
    public BasicTriangle(int aH, int aHe)
    {
        super(aH);
        this.setHeight(aHe);
    }
    public int getHeight()
    {
        return this.height;
    }
    public void setHeight(int aHe)
    {
        if(aHe >= 1)
            this.height = aHe;
        else
            this.height = 1;
    }
    public void drawShape()
    {
        for(int i=0;i<this.height;i++)
        {
            skipSpaces(super.getHSpace());
            for(int j=0;j<i+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

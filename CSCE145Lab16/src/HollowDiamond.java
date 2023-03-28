/*
 * Written By Anna Phan
 */
public class HollowDiamond extends BasicShape implements Diamond{
    private int width;
    public HollowDiamond()
    {
        super();
        this.width = 3;
    }
    public HollowDiamond(int aH, int aW)
    {
        super(aH);
        this.setWidth(aW);
    }
    public int getWidth()
    {
        return this.width;
    }
    public void setWidth(int aW)//Check for odd number
    {
        if(aW % 2 != 0 && aW >= 3)
            this.width = aW;
        else if (aW % 2 == 0 && aW >= 3)
            this.width = aW+1;
        else
            this.width = 3;
    }
    public void drawShape()
    {
        //Drawing the top point
        int stop = this.getWidth()/2;
        skipSpaces(stop + super.getHSpace());
        System.out.println("*");
        //Draw top half
        int innerSpaces = 1;
        for(int i = 0; i<getWidth()/2;i++)
        {
            skipSpaces(super.getHSpace());
            skipSpaces(stop-1);
            stop--;
            System.out.print("*");
            skipSpaces(innerSpaces);
            innerSpaces = innerSpaces + 2;
            System.out.println("*");
        }
        //Draw bottom half
        for(int i=0;i<(getWidth()/2)-1;i++)
        {
            skipSpaces(super.getHSpace());
            skipSpaces(stop+1);
            stop++;
            System.out.print("*");
            skipSpaces(innerSpaces - 4);
            innerSpaces = innerSpaces - 2;
            System.out.println("*");
        }
        //Drawing the bottom point
        skipSpaces(stop + super.getHSpace()+1);
        System.out.println("*");
    }
}

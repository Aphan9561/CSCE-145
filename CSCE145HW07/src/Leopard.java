/*
 * Written By Anna Phan
 */
public class Leopard extends Cat{
    private int numberOfSpots;
    public Leopard()
    {
        super();
        this.numberOfSpots = 1;
    }
    public Leopard(String aN, double aW, String aM, int nOS)
    {
        super(aN, aW, aM);
        this.setNumberOfSpots(nOS);
    }
    public int getNumberOfSpots()
    {
        return this.numberOfSpots;
    }
    public void setNumberOfSpots(int nOS)
    {
        if(nOS>=1)
            this.numberOfSpots = nOS;
        else
            this.numberOfSpots = 1;
    }
    public boolean equals(Leopard aL)
    {
        return aL != null &&
                super.equals(aL)&&
                this.numberOfSpots == aL.getNumberOfSpots();
    }
    public String toString()
    {
        return super.toString()+" Number of Spots: "+this.numberOfSpots;
    }
}

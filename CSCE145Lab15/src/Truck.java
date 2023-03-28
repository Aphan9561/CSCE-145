/*
 * Written by Anna Phan
 */
public class Truck extends Vehicle{
    //Instance Variables
    private double loadCapacity;
    private double towingCapacity;
    //Default Constructors
    public Truck()
    {
        super();
        this.loadCapacity = this.towingCapacity = 0;
    }
    //Parameterized Constructors
    public Truck(String aMn, int nOC, String oN, double lC, double tC)
    {
        super(aMn, nOC, oN);
        this.setLoadCapacity(lC);
        this.setTowingCapacity(tC);
    }
    //Accessors
    public double getLoadCapacity()
    {
        return this.loadCapacity;
    }
    public double getTowingCapacity()
    {
        return this.towingCapacity;
    }
    //Mutators
    public void setLoadCapacity(double lC)
    {
        if(lC >= 0)
            this.loadCapacity = lC;
        else
            this.loadCapacity = 0;
    }
    public void setTowingCapacity(double tC)
    {
        if(tC >= 0)
            this.towingCapacity = tC;
        else
            this.towingCapacity =0;
    }
    public boolean equals(Truck aT)
    {
        return aT != null &&
                super.equals(aT)&&
                this.loadCapacity == aT.getLoadCapacity()&&
                this.towingCapacity == aT.getTowingCapacity();
    }
    public String toString()
    {
        return super.toString()+" Load Capacity: "+this.loadCapacity+" Towing Capacity: "+this.towingCapacity;
    }
}

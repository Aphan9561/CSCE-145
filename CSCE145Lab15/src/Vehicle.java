/*
 * Written by Anna Phan
 */
public class Vehicle {
    //Instance Variables
    private String manufacturersName;
    private int numberOfCylinders;
    private String ownersName;
    //Default Constructors
    public Vehicle()
    {
        this.manufacturersName = "none";
        this.numberOfCylinders = 1;
        this.ownersName = "none";
    }
    //Parameterized Constructors
    public Vehicle(String aMn, int nOC, String oN)
    {
        this.setManufacturersName(aMn);
        this.setNumberOfCylinders(nOC);
        this.setOwnersName(oN);
    }
    //Accessors
    public String getManufacturersName()
    {
        return this.manufacturersName;
    }
    public int getNumberOfCylinders()
    {
        return this.numberOfCylinders;
    }
    public String getOwnersName()
    {
        return this.ownersName;
    }
    //Mutators
    public void setManufacturersName(String aMn)
    {
        if(aMn != null)
            this.manufacturersName = aMn;
        else
            this.manufacturersName = "none";
    }
    public void setNumberOfCylinders(int nOC)
    {
        if(nOC >= 1)
            this.numberOfCylinders = nOC;
        else
            this.numberOfCylinders = 1;
    }
    public void setOwnersName(String oN)
    {
        if(oN != null)
            this.ownersName = oN;
        else
            this.ownersName = "none";
    }
    public boolean equals(Vehicle aV)
    {
        return aV != null &&
                this.manufacturersName.equals(aV.getManufacturersName())&&
                this.numberOfCylinders == aV.getNumberOfCylinders()&&
                this.ownersName.equals(aV.getOwnersName());
    }
    public String toString()
    {
        return "Manufacturer’s Name: "+this.manufacturersName+" Number of Cylinders: "+this.numberOfCylinders+" Owner: "+this.ownersName;
    }
}

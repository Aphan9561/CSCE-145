/*
 * Written by Anna Phan
 */
public class Car extends Vehicle{
    //Instance Variables
    private double gasMileage;
    private int numberOfPassengers;
    //Default Constructors
    public Car()
    {
        super();
        this.gasMileage = 0;
        this.numberOfPassengers =0;
    }
    //Parameterized Constructors
    public Car(String aMn, int nOC, String oN, double gM, int nOP)
    {
        super(aMn, nOC, oN);
        this.setGasMileage(gM);
        this.setNumberOfPassengers(nOP);
    }
    //Accessors
    public double getGasMileage()
    {
        return this.gasMileage;
    }
    public int getNumberOfPassengers()
    {
        return this.numberOfPassengers;
    }
    //Mutators
    public void setGasMileage(double gM)
    {
        if(gM >= 0)
            this.gasMileage = gM;
        else
            this.gasMileage = 0;
    }
    public void setNumberOfPassengers(int nOP)
    {
        if(nOP >= 0)
            this.numberOfPassengers = nOP;
        else
            this.numberOfPassengers = 0;
    }
    public boolean equals(Car aC)
    {
        return aC != null&&
                super.equals(aC)&&
                this.gasMileage == aC.getGasMileage()&&
                this.numberOfPassengers == aC.getNumberOfPassengers();
    }
    public String toString()
    {
        return super.toString()+" Gas Mileage: "+getGasMileage()+" Passengers: "+getNumberOfPassengers();
    }
}

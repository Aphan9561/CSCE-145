/*
 * Anna Phan
 */
//Step 1: Define the class
public class Cat {
    //Step 2. Data / Properties/ Instance Variables
    private String name;
    private double weight;
    private int numberOfLegs;
    //Step 3. Constructors
    public Cat()//Default Constructor
    {
        this.name = "none";
        this.weight = 1.0;
        this.numberOfLegs = 4;
    }
    public Cat(String aN, double aW, int aL)//Parameterized Constructor
    {
        //call mutators
        this.setName(aN);
        this.setWeight(aW);
        this.setNumberOfLegs(aL);
    }
    //Step 4. Accessors
    public String getName()
    {
        return this.name;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public int getNumberOfLegs()
    {
        return this.numberOfLegs;
    }
    //Step 5. Mutators
    public void setName(String aN)
    {
        if(aN != null)
            this.name = aN;
        else
            this.name = "none";
    }
    public void setWeight(double aW)
    {
        if(aW > 0.0)
            this.weight = aW;
        else
            this.weight = 1.0;
    }
    public void setNumberOfLegs(int aNum)
    {
        if(aNum >= 0 && aNum <= 4)
            this.numberOfLegs = aNum;
        else
            this.numberOfLegs = 4;
    }
    //Step 6. Other Methods
    public String toString()
    {
        return this.name+" "+this.weight+" "+this.numberOfLegs;
    }
    public boolean equals(Cat aC)
    {
        return aC != null &&
                this.name.equals(aC.getName())&&
                this.weight == aC.getWeight() &&
                this.numberOfLegs == aC.getNumberOfLegs();
    }
    public void eat()
    {
        this.weight += 1.0;
    }
    public void sleep()
    {
        System.out.println("Zzz. Cat snore.");
    }
    public void destroyYourStuff()
    {
        System.out.println("I am become "+this.name+" destroyer of worlds.");
    }
}

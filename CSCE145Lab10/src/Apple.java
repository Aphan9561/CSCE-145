/*
 * Written by Anna Phan
 */
public class Apple {
    //Instance Variables
    private String type;
    private double weight;
    private double price;
    //Constructors
    public Apple()
    {
        this.type = "Gala";
        this.weight = 0.0;
        this.price = 0.0;
    }
    //Parameterized Constructor
    public Apple(String aT, double aW, double aP)
    {
        //call mutator
        this.setType(aT);
        this.setWeight(aW);
        this.setPrice(aP);
    }
    //Accessors
    public String getType()
    {
        return this.type;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getPrice()
    {
        return this.price;
    }
    //Mutators
    public void setType(String aT)
    {
        if(aT.equalsIgnoreCase("Gala") || aT.equalsIgnoreCase("Granny Smith") || aT.equalsIgnoreCase("Red Delicious") || aT.equalsIgnoreCase("Gold Delicious") )
        {
            this.type = aT;
        }
        else
        {
            this.type = "Gala";
        }
    }
    public void setWeight(double aW)
    {
        if(aW > 0.0 && aW < 2.0)
        {
            this.weight = aW;
        }
        else
        {
            this.weight = 0.0;
        }
    }
    public void setPrice(double aP)
    {
        if(aP > 0.0)
        {
            this.price = aP;
        }
        else
        {
            this.price = 0.0;
        }
    }
    public String toString()
    {
        return "Type: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
    }
    public boolean equals(Apple aA)
    {
        return aA != null &&
                this.type.equals(aA.getType())&&
                this.weight == aA.getWeight() &&
                this.price == aA.getPrice();
    }
}

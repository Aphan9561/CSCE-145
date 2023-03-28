/*
 * Written by Anna Phan
 */
public class Bread {
    private String name;
    private int calories;
    private String type;
    public Bread()
    {
        this.name = "none";
        this.calories = 50;
        this.type = "Whole Grain";
    }
    public Bread (String aN, int aC, String aT)
    {
        //call mutator
        this.setName(aN);
        this.setCalories(aC);
        this.setType(aT);
    }

    public String getName()
    {
        return this.name;
    }
    public int getCalories()
    {
        return this.calories;
    }
    public String getType()
    {
        return this.type;
    }
    public void setName(String aN)
    {
        if(aN != null)
            this.name = aN;
        else
            this.name = "none";
    }
    public void setCalories(int aC)
    {
        if(aC>=50 && aC<=250)
            this.calories = aC;
        else
            this.calories = 50;
    }
    public void setType(String aT)
    {
        if(aT.equalsIgnoreCase("Honey Wheat")||aT.equalsIgnoreCase("White")||aT.equalsIgnoreCase("Whole Grain")||aT.equalsIgnoreCase("Whole Wheat"))
            this.type = aT;
        else
            this.type = "Whole Grain";
    }
    public boolean equals(Bread aB)
    {
        return aB != null &&
                this.name.equalsIgnoreCase(aB.getName())&&
                this.calories == aB.getCalories()&&
                this.type.equalsIgnoreCase(aB.getType());
    }
    public String toString()
    {
        return "Name: "+this.name+" \nCalories: "+this.calories+" \nType: "+this.type;
    }
}

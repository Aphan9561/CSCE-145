/*
 * Written by Anna Phan
 */
public class Jelly {
    private String name;
    private int calories;
    private String fruitType;
    public Jelly()
    {
        this.name = "none";
        this.calories = 50;
        this.fruitType = "grape";
    }
    public Jelly(String aN, int aC, String aFT)
    {
        //call mutator
        this.setName(aN);
        this.setCalories(aC);
        this.setFruitType(aFT);
    }

    public String getName()
    {
        return this.name;
    }
    public int getCalories()
    {
        return this.calories;
    }
    public String getFruitType()
    {
        return this.fruitType;
    }
    public void setName(String aN) {
        if(aN != null)
            this.name = aN;
        else
            this.name = "none";
    }
    public void setCalories(int aC)
    {
        if(aC >= 50 && aC <= 100)
            this.calories = aC;
        else
            this.calories = 50;
    }
    public void setFruitType(String aFT)
    {
        if(aFT.equalsIgnoreCase("grape")||aFT.equalsIgnoreCase("apple")||aFT.equalsIgnoreCase("blackberry")||aFT.equalsIgnoreCase("mango")||aFT.equalsIgnoreCase("tomato"))
            this.fruitType = aFT;
        else
            this.fruitType = "grape";
    }
    public boolean equals(Jelly aJ)
    {
        return aJ != null &&
                this.name.equalsIgnoreCase(aJ.getName())&&
                this.calories == aJ.getCalories()&&
                this.fruitType.equalsIgnoreCase(aJ.getFruitType());
    }
    public String toString()
    {
        return "Name: "+this.name+" \nCalories: "+this.calories+" \nFruit Type: "+this.fruitType;
    }
}


/*
 * Written by Anna Phan
 */
public class PeanutButter {
    private String name;
    private int calories;
    private boolean isCrunchy;
    public PeanutButter()
    {
        this.name = "none";
        this.calories = 100;
        this.isCrunchy = false;
    }
    public PeanutButter(String aN, int aC, boolean isC)
    {
        //call mutator
        this.setName(aN);
        this.setCalories(aC);
        this.setCrunchy(isC);
    }

    public String getName()
    {
        return this.name;
    }
    public int getCalories()
    {
        return this.calories;
    }
    public boolean getIsCrunchy()
    {
        return this.isCrunchy;
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
        if(aC >= 100 && aC <= 300)
            this.calories = aC;
        else
            this.calories = 100;
    }
    public void setCrunchy(boolean isC)
    {
        if(isC == true || isC == false)
            this.isCrunchy = isC;
        else
            this.isCrunchy = false;
    }
    public boolean equals(PeanutButter aPB)
    {
        return aPB != null &&
                this.name.equalsIgnoreCase(aPB.getName())&&
                this.calories == aPB.getCalories()&&
                this.isCrunchy == aPB.getIsCrunchy();
    }
    public String toString()
    {
        return "Name: "+this.name+" \nCalories: "+this.calories+" \nIs it Crunchy? "+this.isCrunchy;
    }
}

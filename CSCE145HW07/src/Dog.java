/*
 * Written By Anna Phan
 */
public class Dog extends Animal{
    private int energyLevel;
    public Dog()
    {
        super();
        this.energyLevel = 0;
    }
    public Dog(String aN, double aW, int eL)
    {
        super(aN, aW);
        this.setEnergyLevel(eL);
    }
    public int getEnergyLevel()
    {
        return this.energyLevel;
    }
    public void setEnergyLevel(int eL)
    {
        if(eL >= 0 && eL <= 100)
            this.energyLevel = eL;
        else
            this.energyLevel = 0;
    }
    public boolean equals(Dog aD)
    {
        return aD != null&&
                super.equals(aD)&&
                this.energyLevel == aD.getEnergyLevel();
    }
    public String toString()
    {
        return super.toString()+" Energy Level: "+this.energyLevel;
    }
}

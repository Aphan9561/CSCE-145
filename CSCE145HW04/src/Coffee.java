/*
 * Written by Anna Phan
 */
public class Coffee {

    private String name;
    private double caffeine;//Caffeine content
    public Coffee()
    {
        this.name = "None";//Default name
        this.caffeine = 50.0;//Default Caffeine Content
    }
    public Coffee(String aN, double aC)
    {
        //call mutator
        this.setName(aN);
        this.setCaffeine(aC);
    }
    public String getName()
    {
        return this.name;
    }
    public double getCaffeine()
    {
        return this.caffeine;
    }
    public void setName(String aN)
    {
        if(aN != null)
        {
            this.name = aN;
        }
        else
        {
            this.name = "none";
        }
    }
    public void setCaffeine(double aC)
    {
        if(aC > 50 && aC < 300)
        {
            this.caffeine = aC;
        }
        else
        {
            this.caffeine = 50.0;
        }
    }
    public String toString()
    {
        return this.name+" "+this.caffeine;
    }
    public boolean equals(Coffee aE)
    {
        return aE != null&&
                this.name.equals(aE.getName())&&
                this.caffeine == aE.getCaffeine();
    }
    public double riskyAmount(Coffee coffee)//Calculating how many more mg til risky
    {
        return this.caffeine = 180.0/((caffeine/100.0)*6.0);
    }
}

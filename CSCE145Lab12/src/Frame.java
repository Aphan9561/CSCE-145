/*
 * Written by Anna Phan
 */
public class Frame {
    private double size;
    private String type;
    public Frame()//default
    {
        this.size = 18.5;
        this.type = "Diamond";
    }
    public Frame(double aS, String aT)
    {
        //call mutator
        this.setSize(aS);
        this.setType(aT);
    }
    public double getSize()
    {
        return this.size;
    }
    public String getType()
    {
        return this.type;
    }
    public void setSize(double aS)
    {
        if(aS >= 18.5 && aS<=60)
            this.size = aS;
        else
            this.size = 18.5;
    }
    public void setType(String aT)
    {
        if(aT.equalsIgnoreCase("Diamond") || aT.equalsIgnoreCase("Step-Through") || aT.equalsIgnoreCase("Truss") || aT.equalsIgnoreCase("Penny-Farthing"))
            this.type = aT;
        else
            this.type = "Diamond";
    }
    public boolean equals(Frame aF)
    {
        return aF != null &&
                this.size == aF.getSize()&&
                this.type.equals(aF.getType());
    }
    public String toString()
    {
        return "[Frame] Size: "+this.size+" Type: "+this.type;
    }

}

/*
 * Written by Anna Phan
 */
public class Wheel {
    private double diameter;
    private double width;
    public Wheel()//default
    {
        this.diameter = 16;
        this.width = 1;
    }
    public Wheel(double aD, double aW)
    {
        //call mutator
        this.setDiameter(aD);
        this.setWidth(aW);
    }

    public double getDiameter()
    {
        return this.diameter;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setDiameter(double aD)
    {
        if(aD >= 16.0 && aD <= 55.0)
            this.diameter = aD;
        else
            this.diameter = 16.0;
    }
    public void setWidth(double aW)
    {
        if(aW >= 1.0 && aW <= 2.5)
            this.width = aW;
        else
            this.width = 1.0;
    }
    public boolean equals(Wheel aWh)
    {
        return aWh != null&&
                this.diameter == aWh.getDiameter()&&
                this.width == aWh.getWidth();
    }
    public String toString()
    {
        return "[Wheel] Diameter: "+this.diameter+" Width: "+this.width;
    }

}

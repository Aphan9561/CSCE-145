/*
 * Written by Anna Phan
 */
public class Box {
    private String label;
    private double length;
    private double width;
    private double height;
    public Box()
    {
        this.label = "none";
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    public Box(String aLa, double aLe, double aW, double aH)
    {
        this.setLabel(aLa);
        this.setLength(aLe);
        this.setWidth(aW);
        this.setHeight(aH);
    }
    public String getLabel()
    {
        return this.label;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setLabel(String aLa)
    {
        if(aLa != null)
            this.label = aLa;
        else
            this.label = "none";
    }
    public void setLength(double aLe)
    {
        if(aLe > 0)
            this.length = aLe;
        else
            this.length = 1.0;
    }
    public void setWidth(double aW)
    {
        if(aW > 0)
            this.width = aW;
        else
            this.width = 1.0;
    }
    public void setHeight(double aH)
    {
        if(aH > 0)
            this.height = aH;
        else
            this.height = 1.0;
    }
    public double getVolume()
    {
        return this.length*this.width*this.height;
    }
    public String toString()
    {
        return "Label: "+this.label+" Volume: "+getVolume();
    }
}

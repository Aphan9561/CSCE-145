/*
 * Written by Anna Phan
 */
public class Clothing {
    private String type;
    private String color;
    public Clothing()
    {
        this.type = "socks";
        this.color = "black";
    }
    public Clothing(String aT, String aC)
    {
        this.setType(aT);
        this.setColor(aC);
    }
    public String getType()
    {
        return this.type;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setType(String aT)
    {
        if(aT.equalsIgnoreCase("undergarment") ||
                aT.equalsIgnoreCase("socks") ||
                aT.equalsIgnoreCase("stockings") ||
                aT.equalsIgnoreCase("top")||
                aT.equalsIgnoreCase("bottom")||
                aT.equalsIgnoreCase("cape"))
            this.type = aT;
        else
            this.type = "socks";
    }
    public void setColor(String aC)
    {
        if(aC.equalsIgnoreCase("brown")||
                aC.equalsIgnoreCase("red")||
                aC.equalsIgnoreCase("pink")||
                aC.equalsIgnoreCase("black")||
                aC.equalsIgnoreCase("orange")||
                aC.equalsIgnoreCase("white")||
                aC.equalsIgnoreCase("green")||
                aC.equalsIgnoreCase("blue")||
                aC.equalsIgnoreCase("purple")||
                aC.equalsIgnoreCase("grey"))
            this.color = aC;
        else
            this.color = "black";
    }
    public String toString()
    {
        return "[Clothing] Type: "+this.type+" Color: "+this.color;
    }
}

/*
 * Written By Anna Phan
 */
public class Wolf extends Dog{
    private String packLeaderName;
    public Wolf()
    {
        super();
        this.packLeaderName = "none";
    }
    public Wolf(String aN, double aW, int eL, String pLN)
    {
        super(aN, aW, eL);
        this.setPackLeaderName(pLN);
    }
    public String getPackLeaderName()
    {
        return this.packLeaderName;
    }
    public void setPackLeaderName(String pLN)
    {
        if(pLN != null)
            this.packLeaderName = pLN;
        else
            this.packLeaderName = "none";
    }
    public boolean equals(Wolf aW)
    {
        return aW != null&&
                super.equals(aW)&&
                this.packLeaderName.equals(aW.getPackLeaderName());
    }
    public String toString()
    {
        return super.toString()+" Pack Leader Name: "+this.packLeaderName;
    }
}

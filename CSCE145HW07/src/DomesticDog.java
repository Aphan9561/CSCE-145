/*
 * Written By Anna Phan
 */
public class DomesticDog extends Dog{
    private String type;
    public DomesticDog()
    {
        super();
        this.type = "Mutt";
    }
    public DomesticDog(String aN, double aW, int eL, String aT)
    {
        super(aN, aW, eL);
        this.setType(aT);
    }
    public String getType()
    {
        return this.type;
    }
    public void setType(String aT)
    {
        if(aT.equalsIgnoreCase("Retriever")||
                aT.equalsIgnoreCase("Terrier")||
                aT.equalsIgnoreCase("Husky")||
                aT.equalsIgnoreCase("Mutt"))
            this.type = aT;
        else
            this.type = "Mutt";
    }
    public boolean equals(DomesticDog aDD)
    {
        return aDD != null &&
                super.equals(aDD)&&
                this.type.equals(aDD.getType());
    }
    public String toString()
    {
        return super.toString()+" Type: "+this.type;
    }
}

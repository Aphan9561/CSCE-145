/*
 * Written by Anna Phan
 */
public class PBJSandwich {
    private Bread topSlice;
    private PeanutButter peanutButter;
    private Jelly jelly;
    private Bread bottomSlice;

    public PBJSandwich()
    {
        this.topSlice = new Bread();
        this.peanutButter = new PeanutButter();
        this.jelly = new Jelly();
        this.bottomSlice = new Bread();
    }
    public PBJSandwich(Bread TS, PeanutButter PB, Jelly J, Bread BS)
    {
        //call mutator
        this.setTopSlice(TS);
        this.setPeanutButter(PB);
        this.setJelly(J);
        this.setBottomSlice(BS);
    }
    public Bread getTopSlice()
    {
        return this.topSlice;
    }
    public PeanutButter getPeanutButter()
    {
        return this.peanutButter;
    }
    public Jelly getJelly()
    {
        return this.jelly;
    }
    public Bread getBottomSlice()
    {
        return this.bottomSlice;
    }
    public void setTopSlice(Bread TS)
    {
        if(TS != null)
            this.topSlice = TS;
        else
            this.topSlice = new Bread();
    }

    public void setPeanutButter(PeanutButter PB)
    {
        if(PB != null)
            this.peanutButter = PB;
        else
            this.peanutButter = new PeanutButter();
    }
    public void setJelly(Jelly J)
    {
        if(J != null)
            this.jelly = J;
        else
            this.jelly = new Jelly();
    }
    public void setBottomSlice(Bread BS)
    {
        if(BS != null)
            this.bottomSlice = BS;
        else
            this.bottomSlice = new Bread();
    }
    public boolean equals(PBJSandwich PBJS)
    {
        return PBJS != null&&
                this.topSlice.equals(PBJS.getTopSlice())&&
                this.peanutButter.equals(PBJS.getPeanutButter())&&
                this.jelly.equals(PBJS.getJelly())&&
                this.bottomSlice.equals(PBJS.getBottomSlice());
    }
    public String toString()
    {
        return "[Top Slice] \n"+this.topSlice+" \n[Peanut Butter] \n"+this.peanutButter+" \n[Jelly] \n"+this.jelly+" \n[Bottom Slice] \n"+this.bottomSlice;
    }
}

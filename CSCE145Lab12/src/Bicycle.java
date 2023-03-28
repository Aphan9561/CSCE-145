/*
 * Written by Anna Phan
 */
public class Bicycle {
    private String make;
    private Wheel frontWheel;
    private Wheel backWheel;
    private Frame frame;

    public Bicycle() // default
    {
        this.make = "none";
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }
    public Bicycle(String aM, Wheel FW, Wheel BW, Frame F)
    {
        this.setMake(aM);
        this.setFrontWheel(FW);
        this.setBackWheel(BW);
        this.setFrame(F);
    }
    public String getMake()
    {
        return this.make;
    }
    public Wheel getFrontWheel()
    {
        return this.frontWheel;
    }
    public Wheel getBackWheel()
    {
        return this.backWheel;
    }
    public Frame getFrame()
    {
        return this.frame;
    }
    public void setMake(String aM)
    {
        if(aM != null)
            this.make = aM;
        else
            this.make = "none";
    }
    public void setFrontWheel(Wheel FW)
    {
        if(FW != null)
            this.frontWheel = FW;
        else
            this.frontWheel = new Wheel();
    }
    public void setBackWheel(Wheel BW)
    {
        if(BW != null)
            this.backWheel = BW;
        else
            this.backWheel = new Wheel();
    }
    public void setFrame(Frame F)
    {
        if(F != null)
            this.frame = F;
        else
            this.frame = new Frame();
    }
    public boolean equals(Bicycle aB) // checks if they are equal
    {
        return aB != null &&
                this.make.equalsIgnoreCase(aB.getMake())&&
                this.frontWheel.equals(aB.getFrontWheel()) &&
                this.backWheel.equals(aB.getBackWheel()) &&
                this.frame.equals(aB.getFrame());
    }
    public String toString()
    {
        return "[Bicycle] Make: "+this.make+" Front Wheel: "+this.frontWheel+" Back Wheel: "+this.backWheel+" Frame: "+this.frame;
    }
}

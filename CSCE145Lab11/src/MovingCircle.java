/*
 * Written by Anna Phan
 */
public class MovingCircle {
    //Instance Variable
    private double X;
    private double Y;
    private double diameter;
    private double velocityX;
    private double velocityY;
    //Default constructor
    public MovingCircle()
    {
        this.X = 0;
        this.Y = 0;
        this.diameter = 0;
        this.velocityX = 0;
        this.velocityY = 0;
    }
    //Parameterized Constructor
    public MovingCircle(double aX, double aY, double aD, double aVX, double aVY)
    {
        //call mutator
        this.setX(aX);
        this.setY(aY);
        this.setDiameter(aD);
        this.setVelocityX(aVX);
        this.setVelocityY(aVY);
    }

    public double getX()
    {
        return this.X;
    }
    public double getY()
    {
        return this.Y;
    }
    public double getDiameter()
    {
        return this.diameter;
    }
    public double getVelocityX()
    {
        return this.velocityX;
    }
    public double getVelocityY()
    {
        return this.velocityY;
    }
    public void setX(double aX)
    {
        if(aX >= 0.0 || aX <= 0.0)
            this.X = aX;
        else
            this.X = 0.0;
    }
    public void setY(double aY)
    {
        if(aY >= 0.0 || aY <= 0.0)
            this.Y = aY;
        else
            this.Y = 0.0;
    }
    public void setDiameter(double aD)
    {
        if(aD >= 0.0)
            this.diameter = aD;
        else
            this.diameter = 0.0;
    }
    public void setVelocityX(double aVX)
    {
        if(aVX >= 0.0 || aVX <= 0.0)
            this.velocityX = aVX;
        else
            this.velocityX = 0.0;
    }
    public void setVelocityY(double aVY)
    {
        if(aVY >= 0.0 || aVY <= 0.0)
            this.velocityY = aVY;
        else
            this.velocityY = 0.0;
    }
    public boolean equals(MovingCircle aMC)
    {
        return aMC != null &&
                this.X == aMC.getX() &&
                this.Y == aMC.getY() &&
                this.diameter == aMC.getDiameter() &&
                this.velocityX == aMC.getVelocityX() &&
                this.velocityY == aMC.getVelocityY();
    }
    public String toString()
    {
        return "[Circle] X: "+this.X+" Y: "+this.Y+" Diameter: "+this.diameter+" Velocity X: "+this.velocityX+" Velocity Y: "+this.velocityY;
    }
    //Updates the X and the Y positions by adding its velocities.
    public void move()
    {
        this.X = X+velocityX;
        this.Y = Y+velocityY;
    }
    public boolean isColliding(MovingCircle circle)
    {
        //equation to check if the circles colloid
        if((this.diameter/2)+(circle.diameter/2) >= Math.sqrt((circle.X - this.X)*(circle.X - this.X)+(circle.Y - this.Y)*(circle.Y - this.Y)))
            return true;
        else
            return false;
    }
}

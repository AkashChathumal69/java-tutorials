public class Rectangle implements Shape 
{
    private double lengthR,width;
        
    public double calculateArea()
    {
        return lengthR*width;
    }
   
    public Rectangle(double lengthR,double width)
    {
        this.lengthR=lengthR;
        this.width=width;
    }
    
    public void setLengthR(double lR)
    {
        lengthR=lR;
    }
    public void setWidth(double w)
    {
        width=w;
    }
    
    public double getLengthR()
    {
        return lengthR;
    }    
    public double getWidth()
    {
        return width;
    }
}

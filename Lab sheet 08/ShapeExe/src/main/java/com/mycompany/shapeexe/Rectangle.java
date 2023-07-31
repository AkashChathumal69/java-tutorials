
package com.mycompany.shapeexe;

public class Rectangle {
    
    
    
    
    private double a,b;
    
    public void setData(double a,double b ) {
    
    this.a=a;
    this.b=b;

    }
    
    public double getwhith() {
    
    return this.a;

    }
    
     public double getHigh() {
    
    return this.b;

    }
    
    
   
    
    
     public double calculateArea(){
     
     
     return this.a*this.b;
     
     }
    
     
      public  double calculatePerimeter() {
      
      return 2*(this.a+this.b);
      
      
      }
    
}

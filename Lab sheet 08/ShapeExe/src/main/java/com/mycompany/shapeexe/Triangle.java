/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeexe;

/**
 *
 * @author lakshitha
 */
public class Triangle {
    
    
    
    private double a,b,c;
    
    public void setData(double a,double b,double c ) {
    
    this.a=a;
    this.b=b;

    }
    
    public double getA() {
    
    return this.a;

    }
    
     public double getB() {
    
    return this.b;
    

    }
     
     public double getc() {
    
     return this.c;
     }
    
   
    
    
     public double calculateArea(){
     
     
     return 1/2*this.a*this.b;
     
     }
    
     
      public  double calculatePerimeter() {
      
      return (this.a+this.b+this.c);
      
      
      }
    
}

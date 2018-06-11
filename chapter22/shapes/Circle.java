// ------------------------------------------------
// File name: Rectangle.java
// Written by: Yuriy Kuptsov
// ------------------------------------------------
// Time Spent: ~6 hours
// ------------------------------------------------
// Date: Oct 2, 2017
package chapter22.shapes;

import java.text.DecimalFormat;

public class Circle extends GeometricObject {
    
    private double radius;
    
    public Circle(){};
    public Circle (double radius){
    this.radius= radius;
    }
    public Circle (double radius,String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
    this.radius=radius;
    }
    
    public double getDiametr(){        
        return radius*2;
    }
    //public void setDiameter(double diameter){
    //this.dia
    //}
    public double getArea(){
        return radius*radius*(Math.PI);
    }
    public double getPerimeter(){
        return radius*2*(Math.PI);
    }
    
    public String getName(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "[Circle] radius = "+(numberFormat.format(radius));
    }
    //defining natural ordering of circle object
    @Override
        public int compareTo(Object oCirc){
            Circle circObj = (Circle)oCirc;//casting in to circle object
            return (int)(this.radius - circObj.radius);// comparing radius of circle objects
        }
    // returns the string representation of circle oject
    @Override
    public String toString(){
    return "Created on "+getDateCreated()+"\n"+super.toString();
}    
    
}

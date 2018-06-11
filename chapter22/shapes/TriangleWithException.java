// Program: TriangleWithException.java
// Written by: Yuriy Kuptsov
// ------------------------------------------------
// Time Spent: ~2:30 minutes
/**
* Description:
 The program will check sides of a triangle and throw an exception
 * if one of the sides is bigger the the other two added together
 * it will also calculate and display area and radius of a triangle
// ------------------------------------------------
// Date: October 14, 2017
package shape.test;

/**
 * @author Yuriy
 */     
package chapter22.shapes;


public class TriangleWithException extends Shape {
    
    private double side1;
    private double side2;
    private double side3;
    
    public TriangleWithException(){ // default constructor
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
    }
    
    // constructor that will throw an exception if  
    //one of the sides is bigger than two out of tree added together
    public TriangleWithException(double side1, double side2, double side3) 
    throws   IllegalTriangleException {
        if (side1 >= (side2 + side3))
            throw new IllegalTriangleException(side1,side2,side3);
        else if (side2 >= (side1 + side3))
            throw new IllegalTriangleException(side1,side2,side3);
        else if (side3 >= (side2 + side1))
        throw new IllegalTriangleException(side1,side2,side3);
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }
    
    
    public double getPerimeter(){// get perimeter
        return side1+side2+side3;
    }
    public double getArea() { // get area
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public String getName() { // get sides in a string
    return "Side1: " + side1 + "\nSide2: " + side2
           + "\nSide3: " + side3;
    }
    
}
   

// Program: IllegalTriangleException.java
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

public class IllegalTriangleException extends Exception {        
private double side1,side2,side3;
    public IllegalTriangleException(double side1,double side2,double side3) { // constructor with 3 paramiters
        super("Illegal triangleside\nSide1: " + side1 + "\nSide2: " + side2+ "\nSide3: " + side3);
                this.side1 = side1;
                this.side2 = side2;
                this.side3=side3;
    }
    
    
}

// Program: Triangle.java
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

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getName() {
    return " Triangle: Side 1 = " + side1 + ", Side 2 = " + side2
           + ", Side 3 = " + side3;
    }
}

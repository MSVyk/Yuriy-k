// ------------------------------------------------
// File name:: Shape.java
// Written by: Yuriy Kuptsov
// ------------------------------------------------
// Time Spent: ~6 hours
// ------------------------------------------------
// Date: Oct 2, 2017
package chapter22.shapes;

public abstract class Shape {
    private int x; //declaring instance variables of type int
    private int y;
    public Shape(){}; // defoult constructor
    public Shape(int x, int y){ // constructor with 2 int parameters
    this.x=x; 
    this.y=y;
    };
    //setters and getters
    void SetX(int x){ 
    this.x = x;
    }
    void SetY(int y){
    this.y=y;
    }
    int getX(){ 
        return this.x;
    }
    int getY(){
        return this.y;
    }
    //abstract methods
    public abstract String getName(); 
    public abstract double getArea();
    public abstract double getPerimeter();
    
    
}

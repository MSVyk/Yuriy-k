// ------------------------------------------------
// File name: GeometricObject.java
// Written by: Yuriy Kuptsov
// ------------------------------------------------
// Time Spent: ~6 hours
// ------------------------------------------------
// Date: Oct 2, 2017
package chapter22.shapes;

import java.util.Date;

public abstract class GeometricObject extends Shape implements Comparable {
    //declaring instance variables
    private String color;
    private boolean filled;
    private Date dateCreated= new Date();
    
    GeometricObject(){
    this.color="White";
    };
    //constructor with two parameters
    GeometricObject(String color, boolean filled){
    this.color=color;
    this.filled=filled;
    };
    //constructor with four parameters
    GeometricObject(int x, int y, String color, boolean filled){
        super(x,y);        
        this.color=color;
        this.filled=filled;        
    };
    //setters and getters
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }
    boolean isFilled(){
        return this.filled;
    }
    void setFilled(boolean filled){
        this.filled=filled;
    }
    Date getDateCreated(){
        return this.dateCreated;
    }
    // returns string representation of GeometricObject
    @Override
    public String toString() {
    return "color: " + this.color+" and "+"filled: " +this.filled+"\n\n";
   }
    
    //Defining natural orderring
    @Override
    public int compareTo(Object Obj){
        GeometricObject gObj = (GeometricObject)Obj; // casting in to GeometricObject
        int result1=this.color.compareTo(gObj.color); //comparing color
        if (result1!=0)
            return result1;
        int result2=this.dateCreated.compareTo(gObj.dateCreated);//comparing dateCreated
        if (result2!=0)
            return result2;
        if (this.filled==gObj.filled)//comparing filled
            return 0;
        else
            return -1;
    }
    //comparing two GeometricObjects and returns the biggest
    public static GeometricObject max(GeometricObject o1, GeometricObject o2){
        if (o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }
}

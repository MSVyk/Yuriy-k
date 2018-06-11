// ------------------------------------------------
// File name: Rectangle.java
// Written by: Yuriy Kuptsov
// ------------------------------------------------
// Time Spent: ~6 hours
// ------------------------------------------------
// Date: Oct 2, 2017
package chapter22.shapes;

public class Rectangle extends GeometricObject{
        private double height;
        private double width;
        
        public Rectangle(double width, double height){
        this.height=height;
        this.width=width;
        };
        

        public Rectangle() {
        width = 10.0;
        height = 5.0;
        }
 
        public void setHeight(double height) {
            this.height = height;           
        }
        public void setWidth(double width) {
            this.width=width;
        }
        public double getHeight() {
            return height;
        }
        public double getWidth() {
            return width;
        }
        public double getArea() {
            return height * width;
        }
        public double getPerimeter() {
        return 2 * (height + width);
        }
        //returns the description of rectangle object
        public String getName() {
            return "[Rectangle] width = "+this.width+" and height "+this.height;
        }
        //defining natural ordering fo rectangle objrcts
        @Override
        public int compareTo(Object oRect){
            Rectangle gObj = (Rectangle)oRect; //casting in to rectangle object
            if (this.height != gObj.height) // comparing hights of two rectangle objects
                return (int)(this.height - gObj.height);
            
            return (int)(this.width - gObj.width);
        }
        //returns string representation of rectangle objects
        @Override
        public String toString(){
        return "Created on "+getDateCreated()+"\n"+super.toString();
        }   
}


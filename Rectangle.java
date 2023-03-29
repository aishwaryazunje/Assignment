// com.cognizant.shapes.Rectangle.java
package com.congnizant.shapes;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
    }
}
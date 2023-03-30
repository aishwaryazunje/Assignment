package com.congnizant.shapes;

class Circle {
    public double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }
}

class Square {
    public int calculateArea(int sides) {
        return sides * sides;
    }
}

class Triangle {
    public double calculateArea(int sides) {
        return 0.433 * sides * sides;
    }
}


public class Shapes {
    private int numberOfSides;

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void calculateShapeArea(int sideLength) {
        switch (numberOfSides) {
            case 1:
                Circle circle = new Circle();
                double circleArea = circle.calculateArea(sideLength);
                System.out.println("The Area of the Circle is " + circleArea);
                break;
            case 3:
                Triangle triangle = new Triangle();
                double triangleArea = triangle.calculateArea(sideLength);
                System.out.println("The Area of the Triangle is " + triangleArea);
                break;
            case 4:
                Square square = new Square();
                int squareArea = square.calculateArea(sideLength);
                System.out.println("The Area of the Square is " + squareArea);
                break;
            default:
                System.out.println("No Shapes Present");
                break;
        }
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        // Test case 1
        shapes.setNumberOfSides(3);
        shapes.calculateShapeArea(12);

        // Test case 2
        shapes.setNumberOfSides(4);
        shapes.calculateShapeArea(15);

        // Test case 3
        shapes.setNumberOfSides(5);
        shapes.calculateShapeArea(15);
    }
}
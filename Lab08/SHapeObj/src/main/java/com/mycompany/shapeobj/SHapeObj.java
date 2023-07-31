package com.mycompany.shapeobj;

public class SHapeObj {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

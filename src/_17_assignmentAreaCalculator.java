//2. Create an called Shape with:
//
//    An abstract method calculateArea()
//    A concrete method display() that prints "This is a shape."
//
//Then, create two subclasses Circle and Rectangle that extend Shape, implementing calculateArea() accordingly.
//
//    The Circle class should have a radius attribute.
//    The Rectangle class should have length and width attributes.
//
//Write a main() method to instantiate both classes and call their methods.

import java.util.Scanner;

abstract class Shape{
     public abstract double calculateArea();

     void display(){
         System.out.println("This is a shape.");
         System.out.println("Ehlo");
         System.out.println("Hello world");
         System.out.println("Hello world");
     }

}

class Circle extends Shape{
    double radius;
    double areaOfCircle;

    public double calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle.");
        radius = sc.nextDouble();
        areaOfCircle = Math.PI*Math.pow(radius,2);


        return areaOfCircle;

    }
}
class Rectangle extends Shape{
    int length;
    int width;
    int areaOfRectangle;

    public double calculateArea(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");

        length = sc.nextInt();
        System.out.print("Now enter Width: ");
        width = sc.nextInt();

        areaOfRectangle = length*width;

        return areaOfRectangle;
    }
}

public class _17_assignmentAreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

            
    }
}
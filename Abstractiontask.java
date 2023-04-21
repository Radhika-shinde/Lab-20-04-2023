package Abstraction;

//Abstract class Shape
abstract class Shape {
// Abstract method to calculate area
abstract double calculateArea();
}

//Circle class that extends Shape
class Circle extends Shape {
double radius;

// Constructor for Circle class
Circle(double radius) {
   this.radius = radius;
}

// Implementation of calculateArea method for Circle class
@Override
double calculateArea() {
   return Math.PI * radius * radius;
}
}

//Rectangle class that extends Shape
class Rectangle extends Shape {
double length;
double breadth;

// Constructor for Rectangle class
Rectangle(double length, double breadth) {
   this.length = length;
   this.breadth = breadth;
}

// Implementation of calculateArea method for Rectangle class
@Override
double calculateArea() {
   return length * breadth;
}
}


public class Abstractiontask {

	public static void main(String[] args) {
		 // Create objects of Circle and Rectangle classes
	     Circle circle = new Circle(5);
	     Rectangle rectangle = new Rectangle(10, 20);

	     // Call calculateArea method for Circle and Rectangle objects
	     double circleArea = circle.calculateArea();
	     double rectangleArea = rectangle.calculateArea();

	     // Display the calculated areas
	     System.out.println("Area of Circle: " + circleArea);
	     System.out.println("Area of Rectangle: " + rectangleArea);

	}

}

/*Write an abstract class "Shape" which has a method "calculateArea()" which returns the area of the shape. Write two subclasses "Circle" and "Rectangle" which implement the method "calculateArea()" for their respective shapes.*/
abstract class Shape {
  abstract double calculateArea();
}

class Circle extends Shape {
  double calculateArea() {
    int r = 23;
    double area = 3.14 * r * r;
    return area;
  }
}

class Rectangle extends Shape {
  double calculateArea() {
    int l = 10, b = 20;
    double area = l * b;
    return area;
  }
}

class AbstractClass1 {
  public static void main(String args[]) {
    Shape circle = new Circle();
    Shape rect = new Rectangle();
    System.out.println(circle.calculateArea());
    System.out.println(rect.calculateArea());
  }
}
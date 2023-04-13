/*Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.*/
class Shape {
  int getArea() {
    return 0;
  }
}

class Circle extends Shape {
  int getArea(double pi, double rad) {
    double area = pi * rad * rad;
    System.out.println("Area of circle is:");
    return area;
  }
}

class Rectangle extends Shape {
  int getArea(int w, int l) {
    double area = w * l;
    System.out.println("Area of Rectangle is:");
    return area;
  }
}

class ShapeDemo {
  public static void main(String args[]) {
    Circle obj = new Circle();
    Rectangle obj1 = new Rectangle();

    obj.getArea(3.14, 10);
    obj1.getArea(10, 20);

  }
}
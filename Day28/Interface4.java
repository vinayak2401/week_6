/*Create an interface Shape with the following methods:
public double area();
public double perimeter();
Create classes Circle, Rectangle, and Triangle that implement this interface.*/
interface Shape {
  double area();

  double perimeter();
}

class Circle implements Shape {
  public double area() {
    double r = 10;
    double pi = 3.14;

    double area = (pi * r * r);
    System.out.println("Area of circle is: "+area);
    return area;
  }

  public double perimeter() {
    double r = 10;
    double pi = 3.14;

    double perimeter = (2 * pi * r);
    System.out.println("Perimeter of circle is: "+perimeter);
    return perimeter;
  }

}

class Rectangle implements Shape {
  public double area() {
    double l = 10, b = 20;

    // 
    double area = (l * b);
    System.out.println("Area of Rectangle is: "+area);
    return area;
  }

  public double perimeter() {
    double l = 10, w = 20;

    
    double perimeter = (2 * (l + w));
    System.out.println("Perimeter of Rectangle is: "+perimeter);
    return perimeter;
  }
}

class Triangle implements Shape {
  public double area() {
    double h = 10, b = 15;

    
    double area = ((h * b) / 2);
    System.out.println("Area of Triangle is: "+area);
    return area;
  }

  public double perimeter() {
    double a = 10, b = 5, c = 7;

    
    double perimeter = (a * b * c);
    System.out.println("Perimeter of Triangle is: "+perimeter);
    return perimeter;
  }
}

class Interface4 {
  public static void main(String args[]) {
    Shape c = new Circle();
    // System.out.println("Area of Rectangle is: "+c.area());
     c.area();
    //System.out.println("circle area is"+area);
    c.perimeter();
    Shape r = new Rectangle();
    r.area();
    r.perimeter();
    Shape t = new Triangle();
    t.area();
    t.perimeter();
  }
}
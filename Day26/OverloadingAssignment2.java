/*create a class named "Shape" with three methods named "area", In first method find the area of the rectangle, second method find the area of the circle and third method find the area of the square.*/
class Shape {
  void area() {
    int width = 10;
    int length = 20;
    System.out.println("Area of the rectangle is:");
    System.out.println(width * length);
  }

  void area(double a, double b) {

    System.out.println("Area of the Circle is:");
    System.out.println(a * b * b);

  }

  void area(int a) {
    System.out.println("Area of the Square is:");
    System.out.println(a * a);
  }
}

class Assignment2 {
  public static void main(String args[]) {
    Shape obj = new Shape();
    obj.area();
    obj.area(3.14, 10);
    obj.area(10);
  }
}
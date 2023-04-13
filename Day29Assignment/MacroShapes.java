/*Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.*/
class InvalidDimensionsException extends Exception {
  InvalidDimensionsException(String str) {
    super(str);
  }
}

class Shape {
  int area() {
    return 0;
  }

  int perimeter() {
    return 0;
  }
}

class Circle extends Shape {
  public void area(String c) throws InvalidDimensionsException {
    if (c.equals("Circle")) {
      double r = 10;
      double pi = 3.14;
      double area = (pi * r * r);
      System.out.println("Area of circle is: " + area);
    } else {
      throw new InvalidDimensionsException("Invalid");
    }

  }

  public void perimeter(String c) throws InvalidDimensionsException {
    if (c.equals("Circle")) {
      double r = 10;
      double pi = 3.14;

      double perimeter = (2 * pi * r);
      System.out.println("Perimeter of circle is: " + perimeter);

    } else {
      throw new InvalidDimensionsException("Invalid");
    }

  }
}

class Rectangle extends Shape {
  public void area(String r) throws InvalidDimensionsException {
    if (r.equals("Rectangle")) {
      double l = 10, b = 20;

      //
      double area = (l * b);
      System.out.println("Area of Rectangle is: " + area);
    } else {
      throw new InvalidDimensionsException("Invalid");
    }

  }

  public void perimeter(String r) throws InvalidDimensionsException {
    if (r.equals("Rectangle")) {
      double l = 10, w = 20;

      double perimeter = (2 * (l + w));
      System.out.println("Perimeter of Rectangle is: " + perimeter);

    } else {
      throw new InvalidDimensionsException("Invalid");
    }
  }
}

class Triangle extends Shape {
  public void area(String t) throws InvalidDimensionsException {
    if (t.equals("Triangle")) {
      double h = 10, b = 15;

      double area = ((h * b) / 2);
      System.out.println("Area of Triangle is: " + area);
    } else {
      throw new InvalidDimensionsException("Invalid");
    }

  }

  public void perimeter(String t) throws InvalidDimensionsException {
    if (t.equals("Triangle")) {
      double a = 10, b = 5, c = 7;

      double perimeter = (a * b * c);
      System.out.println("Perimeter of Triangle is: " + perimeter);
    } else {
      throw new InvalidDimensionsException("Invalid");
    }

  }
}

class MacroShapes {
  public static void main(String args[]) {
    Circle obj = new Circle();
    try {
      obj.area("Circle");
      obj.perimeter("cle");
    } catch (InvalidDimensionsException e) {
      System.out.println(e);
    }

    Rectangle obj1 = new Rectangle();
    try {
      obj1.area("Rectangle");
      obj1.perimeter("Rectangle");
    } catch (InvalidDimensionsException e) {
      System.out.println(e);
    }

    Triangle obj2 = new Triangle();
    try {
      obj2.area("Triangle");
      obj2.perimeter("angle");
    } catch (InvalidDimensionsException e) {
      System.out.println(e);

    }
  }
}
////////////////////////////////////////////////////////////////
class InvalidDimensionException extends Exception{
  InvalidDimensionException(String str){
    super(str);
  }
}
class Circle{
  void area(int rad) throws InvalidDimensionException{
  if(rad<=0){
  throw new InvalidDimensionException("Invalid radius");
  }
else{
  double area=3.14*rad*rad;
  System.out.println("Area of circle is :"+area);
}
  }
  void perimeter(int rad) throws InvalidDimensionException{
    if(rad<=0){
  throw new InvalidDimensionException("Invalid radius");
  }
else{
  double peri=2*3.14*rad;
  System.out.println("Perimeter is :"+peri);
}
  }
}
class Rectangle{
  void area(int len,int wid) throws InvalidDimensionException{
    if(len<=0 || wid<=0){
      throw new InvalidDimensionException("Invalid dimensions");
    }
    else{
      int area=len*wid;
      System.out.println("area of rectangle is:"+area);
    }
  }
  void perimeter(int len,int wid) throws InvalidDimensionException{
     if(len<=0 || wid<=0){
      throw new InvalidDimensionException("Invalid dimensions");
    }
    else{
      int peri=2*(len+wid);
      System.out.println("perimeter is:"+peri);
    }
  }
}
class ShapeDemo{
  public static void main(String args[]){
    Circle c=new Circle();
    Rectangle r=new Rectangle();
    try{
      c.area(5);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      c.perimeter(0);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      r.area(5,3);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      r.perimeter(5,3);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
  }
}
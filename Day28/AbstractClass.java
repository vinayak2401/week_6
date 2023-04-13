abstract class Shape{
  int l,b;
  Shape(int l, int b){
    this.l=l;
    this.b=b; 
  }
  abstract void done();

  void show(){
    System.out.println(l+" "+b);
  }
}
class Rectangle extends Shape{
  Rectangle(int l, int b){
    super(l, b);
  }
  void done(){
    System.out.println("Rectangle");
  }
}
class Circle extends Shape{
  Circle(int l, int b){
    super(l, b);
  }
  void done(){
    System.out.println("Circle");
  }
}
class AbstractClass{
  public static void main(String args[]){
    Shape obj=new Rectangle(10,20);
    Shape obj1=new Circle(11,15);
    obj.done();
    obj.show();
    obj1.done();
    obj1.show();
  }
}
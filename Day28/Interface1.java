interface Operation{
  void add();
  void sub();
  void mul();
  void div();
}
class Calculator implements Operation{
  public void add(){
    int a=30,b=10;
    System.out.println("Addition is: "+(a+b));
  }
  public void sub(){
    int a=30,b=10;
    System.out.println("Subtraction is: "+(a-b));
  }
  public void mul(){
    int a=30,b=10;
    System.out.println("Multiplication is: "+(a*b));
  }
  public void div(){
    int a=30,b=10;
    System.out.println("Division is: "+(a/b));
  }
}
class Interface1{
  public static void main(String args[]){
    Operation obj=new Calculator();
    obj.add();
    obj.sub();
    obj.mul();
    obj.div();
  }
}
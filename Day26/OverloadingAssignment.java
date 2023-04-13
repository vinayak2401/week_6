/*Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.*/
class Calculator {
  void add(int a, int b) {
    System.out.println("Addition is: ");
    System.out.println(a + b);
  }

  void add(double a, double b) {
    System.out.println("Addition is: ");
    System.out.println(a + b);
  }

  void add(int a, int b, long c) {
    System.out.println("Addition is: ");
    System.out.println(a + b + c);
  }
}

class Assignment {
  public static void main(String args[]) {
    Calculator obj = new Calculator();
    obj.add(10, 20);
    obj.add(22.4, 45.8);
    obj.add(10, 20, 10000);
  }
}
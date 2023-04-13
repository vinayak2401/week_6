class Specifier{
  protected int a;
  int b;
}
class Extra extends Specifier{
  void display(){
  System.out.println(a);
  }
}
class Main{
  public static void main(String args[]){
    Extra obj=new Extra();
    obj.a=20;
    obj.display();
  }
}
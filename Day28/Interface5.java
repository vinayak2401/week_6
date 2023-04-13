/*Create an interface Animal with the following methods:
public void speak();
public void eat();
Create classes Dog, Cat, and Cow that implement this interface. Write a program that accepts the type of animal and calls its speak() and eat() methods.*/
interface Animal{
  void speak();
  void eat();
}
class Dog implements Animal{
  public void speak(){
    System.out.println("Dogs Bark");
  }
  public void eat(){
    System.out.println("Dogs Eat");
  }
}
class Cat implements Animal{
  public void speak(){
    System.out.println("Cats Meow");
  }
  public void eat(){
    System.out.println("Cats Eat");
  }
}
class Cow implements Animal{
  public void speak(){
    System.out.println("Cows Moo");
  }
  public void eat(){
    System.out.println("Cows Eat");
  }
}
class Interface5{
  public static void main(String args[]){
    Animal d=new Dog();
    d.speak();
    d.eat();
     Animal c=new Cat();
    c.speak();
    c.eat();
     Animal co=new Cow();
    co.speak();
    co.eat();
  }
}
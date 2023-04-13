/*Write a program that demonstrates the use of the super keyword in method overriding. Define a superclass called Animal with a method called speak() that prints "Animal speaks". Define a subclass called Dog that extends Animal and overrides the speak() method to print "Dog barks". In the Dog class, call the speak() method of the Animal class using the super keyword.*/
class Animal{
  void speak(){
    System.out.println("Animal Speaks");
  }
}
class Dog extends Animal{
  void speak(){
    super.speak();
    System.out.println("Dog Barks");
  }
}
class AnimalDemo{
  public static void main(String args[]){
    Dog obj=new Dog();
    obj.speak();
  }
}
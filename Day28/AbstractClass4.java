/*Create an abstract class "Person" with a non-abstract method "getFullName()". Implement two subclasses "Student" and "Teacher" which implement the "getFullName()" method and also have their own attributes such as "studentId" and "teacherId"*/

abstract class Person {
  String full_name;

  void getFullName() {
    System.out.println("Hello");
  }
}

class Student extends Person {
  void getFullName() {

    System.out.println("Student name is: Vinayak");
    System.out.println("Id is: 1");
  }

}

class Teacher extends Person {
  void getFullName() {
    System.out.println("Teacher name is: Lalitha");
    System.out.println("Id is: 2");
  }

}

class AbstractClass4 {
  public static void main(String args[]) {

    Person obj1 = new Student();
    obj1.getFullName();

    Person obj2 = new Teacher();
    obj2.getFullName();

  }
}
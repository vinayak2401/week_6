
/*Create an interface Employee with the following methods:public void calculateSalary();
public void displayEmployeeDetails();
Create classes Manager, Developer, and Tester that implement this interface. Write a program that accepts the type of employee and their details (name, age, designation, salary) and calculates their salary based on their designation. Display the employee details and the calculated salary.*/
import java.util.Scanner;

interface Employee {
  void calculateSalary();

  void displayEmployeeDetails();

}

class Manager implements Employee {
  public void calculateSalary() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the salary:");
    double sal = s.nextDouble();
    double hra = ((sal * 80) / 100);
    double da = ((sal * 90) / 100);
    System.out.println("Salary of Manager is: " + (sal + hra + da));
  }

  public void displayEmployeeDetails() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter type of Employee(Manager,Developer,Tester):");
    String type = s.nextLine();
    
    if (type.equals("Manager")) {
      System.out.println("Enter name: ");
      String name = s.next();
      System.out.println("Enter age: ");
      int age = s.nextInt();
      System.out.println("Enter Designation: ");
      String designation = s.nextLine();
      s.nextLine();
      System.out.println("Enter salary: ");
      double salary = s.nextDouble();
      System.out.println("Manager details:");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Designation: " + designation);
      System.out.println("Salary: " + salary);
      System.out.println("Do you want to calculate In-hand salary(Press 1 for yes and 0 for no)");
      int option=s.nextInt();
      if(option==1){
        calculateSalary();
      }
      
    }

    else {
      System.out.println("Enter Manager to update details");
    }

  }
}

class Developer implements Employee {
  public void calculateSalary() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the salary:");
    double sal = s.nextDouble();
    double hra = ((sal * 70) / 100);
    double da = ((sal * 60) / 100);
    System.out.println("Salary of Manager is: " + (sal + hra + da));
  }

  public void displayEmployeeDetails() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter type of Employee(Manager,Developer,Tester):");
    String type1 = s.next();
    if (type1.equals("Developer")) {
      System.out.println("Enter name: ");
      String name1 = s.next();
      System.out.println("Enter age: ");
      int age1 = s.nextInt();
      System.out.println("Enter Designation: ");
      String designation1 = s.nextLine();
      s.nextLine();
      System.out.println("Enter salary: ");
      double salary1 = s.nextDouble();
      System.out.println("Developer details:");
      System.out.println("Name: " + name1);
      System.out.println("Age: " + age1);
      System.out.println("Designation: " + designation1);
      System.out.println("Salary: " + salary1);
      System.out.println("Do you want to calculate In-hand salary(Press 1 for yes and 0 for no)");
      int option=s.nextInt();
      if(option==1){
        calculateSalary();
      }
    } else {
      System.out.println("Enter Developer to update details");
    }

  }
}

class Tester implements Employee {
  public void calculateSalary() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the salary:");
    double sal = s.nextDouble();
    double hra = ((sal * 50) / 100);
    double da = ((sal * 40) / 100);
    System.out.println("Salary of Manager is: " + (sal + hra + da));
  }

  public void displayEmployeeDetails() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter type of Employee(Manager,Developer,Tester):");
    String type2 = s.next();
    if (type2.equals("Tester")) {
      System.out.println("Enter name: ");
      String name2 = s.next();
      System.out.println("Enter age: ");
      int age2 = s.nextInt();
      System.out.println("Enter Designation: ");
      String designation2 = s.next();
      System.out.println("Enter salary: ");
      double salary2 = s.nextDouble();
      System.out.println("Tester details:");
      System.out.println("Name: " + name2);
      System.out.println("Age: " + age2);
      System.out.println("Designation: " + designation2);
      System.out.println("Salary: " + salary2);
      System.out.println("Do you want to calculate In-hand salary(Press 1 for yes and 0 for no)");
      int option=s.nextInt();
      if(option==1){
        calculateSalary();
      }
    } else {
      System.out.println("Enter Tester to update details");
    }

  }
}

class Interface3 {
  public static void main(String args[]) {
    Employee m = new Manager();
    m.displayEmployeeDetails();
   
    Employee d = new Developer();
    d.displayEmployeeDetails();
    d.calculateSalary();
    Employee t = new Tester();
    t.displayEmployeeDetails();
    t.calculateSalary();
  }
}
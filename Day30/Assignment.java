import java.util.Scanner;

 class Employee {
    private String eid;
    private String ename;
    private String esalary;

    // Setter methods
    public void setEid(String eid) {
        
        Scanner sc = new Scanner(System.in);
        while (eid.length() != 7 || !eid.matches("[0-9]+")) {
            System.out.println("Invalid employee ID. Please enter a 7-digit number:");
            eid = sc.nextLine();
        }
        this.eid = eid;
    }

    public void setEname(String ename) {
        
        Scanner sc = new Scanner(System.in);
        while (ename.length() <= 5) {
            System.out.println("Invalid name. Please enter a name with more than 5 characters:");
            ename = sc.nextLine();
        }
        this.ename = ename;
    }

    public void setEsalary(String esalary) {
        
        Scanner sc = new Scanner(System.in);
        while (esalary.length() < 5 || esalary.length() > 10) {
            System.out.println("Invalid salary. Please enter a salary with 5-10 characters:");
            esalary = sc.nextLine();
        }
        this.esalary = esalary;
    }

    // Getter methods
    public String getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getEsalary() {
        return esalary;
    }

    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = new Employee[5];
        Scanner sc = new Scanner(System.in);

        // Add employees using setters
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for employee " + (i+1) + ":");
            Employee emp = new Employee();

            System.out.println("Enter employee ID:");
            emp.setEid(sc.nextLine());

            System.out.println("Enter employee name:");
            emp.setEname(sc.nextLine());

            System.out.println("Enter employee salary:");
            emp.setEsalary(sc.nextLine());

            employees[i] = emp;
        }

        // Display employee information using getters
        System.out.println("\nEmployee Information:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEid());
            System.out.println("Name: " + emp.getEname());
            System.out.println("Salary: " + emp.getEsalary() + "\n");
        }
    }
}
/*import java.util.*;
class Employee{
    private int eId;
    private String name;
    private double salary;

 

    void setEid(int eId){
        this.eId=eId;
    }
    void setName(String name){
        this.name=name;
    }
    void setSalary(double salary){
        this.salary=salary;
    }

 

    int getEid(){
        return eId;
    }
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
}

 

public class EmployeeExample{
    Scanner s=new Scanner(System.in);
    Employee emp[]=new Employee[5];
    int n=0;
    Random random=new Random();
    
    void setDetails(){
        Employee e=new Employee();
        int eid=(int)random.nextInt(900000)+100000;
        e.setEid(eid);
        
        while(true){
            System.out.println("Enter employee name");
            String name=s.nextLine();
            if(name.length()<5){
                System.out.println("name must contain 5 characters ");
            }else{
                e.setName(name);
                break;
            }
        }
        
        while(true){
            System.out.println("Enter employee salary");
            String salary=s.next();
            if(salary.length()<5 && salary.length()<10){
                System.out.println("salary length sould be between 5 to 10 digits ");
            }else{
                double sal=Double.parseDouble(salary);
                e.setSalary(sal);
                break;
            }
        }
        
        emp[n]=e;
        n++;
    }
    
    void getDetails(){
        for(int i=0;i<emp.length;i++){
            System.out.println("id :"+emp[i].getEid()+"name : "+emp[i].getName()+"salary : "+emp[i].getSalary());
        }
    }
    public static void main(String[] args){
        EmployeeExample emp1=new EmployeeExample();
        for(int i=0;i<5;i++){
            emp1.setDetails();
        }
        emp1.getDetails();
    }
}*/

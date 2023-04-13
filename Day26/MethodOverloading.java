class Student {
  void read() {
    System.out.println("Name of the book is Wings of Fire");
  }

  void read(String name) {
    System.out.println("Name of the book is " + name);
  }

  void read(int a) {
    System.out.println("No of copies are "   + 10);
  }
}

public class Sample {
  public static void main(String args[]) {
    Student obj = new Student();
    obj.read();
    obj.read("Wings of Fire");
    obj.read(10);
  }
}
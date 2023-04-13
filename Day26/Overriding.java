class Bank {
  void rateOfInterest() {
    System.out.println("Original Rate of interest is 10rs");
  }
}

class Sbi extends Bank {
  void rateOfInterest() {
    System.out.println("Sbi rate of interest is 15rs");
  }
}

class Hdfc extends Bank {
  void rateOfInterest() {
    super.rateOfInterest();
    System.out.println("Hdfc rate of interest is 20rs");
  }
}

class Overriding {
  public static void main(String args[]) {
    Hdfc obj = new Hdfc();
    obj.rateOfInterest();
  }
}
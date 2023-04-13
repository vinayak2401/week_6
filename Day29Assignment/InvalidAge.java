class InvalidAgeException extends Exception {
  InvalidAgeException(String str) {
    super(str);
  }
}

class Eligibility {
  static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Not eligible");
    } else {
      System.out.println("Eligible");
    }
  }
}

class EHDemo {
  public static void main(String args[]) {
    try {
      Eligibility.validateAge(23);
    } catch (InvalidAgeException e) {
      System.out.println(e);
    }
  }
}

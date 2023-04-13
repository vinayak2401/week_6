class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
}
class CheckMobileNumber{
  void validateMobileNumber(String number) throws InvalidMobileNumberException{
    if(number.length()==10){
      System.out.println("Valid number");
    }else{
      throw new InvalidMobileNumberException("Invalid age");
    }
  }
}
class InvalidMobileNumber{
  public static void main(String args[]){
    CheckMobileNumber num=new CheckMobileNumber();
    try{
    num.validateMobileNumber("92857485");//
  }
  catch(InvalidMobileNumberException e){
    System.out.println(e);
  }
  }
}
class InvalidAgeException extends Exception{
  InvalidAgeException(String str){
    super(str);
  }
}
class VoteEligibility{
 
  static void validateAge(int age) throws InvalidAgeException{
    if(age<18){
      throw new InvalidAgeException("Invalide Age");
    }
    else{
      System.out.println("Eligible");
    }
  }
}
 
class EHDemo{
public static void main(String args[]){
  try{
    VoteEligibility.validateAge(16);//
  }
  catch(InvalidAgeException e){
    System.out.println(e);
  }
}
}
//////////////////////////////////////////////////////////////////////
class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
  
}
class CheckMobileNumber{
  void validateMobileNumber(String number) throws InvalidMobileNumberException{
 
    if(number.length()==10){
      System.out.println("valid mobile number");
    }
    else{
      throw new InvalidMobileNumberException("Invalid Mobile Number");
    }
    
  }
}
 
 
 
class EHDemo{
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
=================================================================================
  class InvalidAmountException extends Exception{
  InvalidAmountException(String str){
    super(str);
  }
}
 
class ATM{
  int balance=50000;
  void withdraw(int withdrawAmount) throws InvalidAmountException{
    if(withdrawAmount>balance){
      throw new InvalidAmountException("Invalid Amount:Insufficient balance");  
    }
    else if(withdrawAmount%100!=0){
      throw new InvalidAmountException("Invalid Amount:Amount should be multiples of 100");
    }
    else{
      balance=balance-withdrawAmount;
      System.out.println("Success");
    }
    
    
  }
}
 
class EHDemo{
public static void main(String args[]){
ATM atm=new ATM();
  try{
    atm.withdraw(55012);
  }
  catch(InvalidAmountException e){
    System.out.println(e);
  }
}
}
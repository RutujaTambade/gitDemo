package Handle;

import java.util.Scanner;

class Insufficientfund extends Exception{
	public Insufficientfund(String s) {
	super(s);
	}
	
	
}
public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double total_amount=1200.00;
// double withdrawl_amount=3400.00;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the amount");
  double withdrawl_amount=sc.nextDouble();
 try {
	 
	 if(total_amount<withdrawl_amount) {
		 
		 //System.out.println("transaction succesfully");
		 throw new Insufficientfund("insufficient fund");
		 
			 }
			 else {
				 
				 System.out.println("transaction success");
				 total_amount=total_amount-withdrawl_amount;
				 System.out.println("remaining balance:" +total_amount);
			 }
		 
 }
 catch(Exception e) {
	 e.getMessage();
	 
 }
	}

}

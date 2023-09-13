package Example;

import java.util.Scanner;

public class AmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,orignalNumber,Reminder,result =0;
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the Armstrong number");
	       number=sc.nextInt();
	       orignalNumber=number;
	       
	       
	       while(orignalNumber !=0)
	       {
	    	   Reminder=orignalNumber%10;
	    	   result += Math.pow(Reminder, 3);
	    	   orignalNumber /=10;
	    	   }
	       if(result==number)
	    	   System.out.println(number + " is an Armstrong number.");
	       else
	           System.out.println(number + " is not an Armstrong number.");

	}

	}


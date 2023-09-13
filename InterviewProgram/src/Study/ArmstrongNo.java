package Study;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
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


/*three digits in an integer, where the sum of the
 *  cubes of its digits is equal to the number itself.
 */

























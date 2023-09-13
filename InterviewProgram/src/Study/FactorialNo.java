package Study;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the factorial number");
		 int number=sc.nextInt();
		
  // int number=8;
   int factorial=number;
   for(int i=(number-1); i>1; i--)
   {
	   factorial=factorial*i;
   }
   System.out.println("factorial of a number is "+ factorial);
	}

}

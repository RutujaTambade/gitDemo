package Example;

import java.util.Scanner;

public class EvenOdd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        
		        int number = sc.nextInt();

		        String evenOdd = (number % 2 == 0) ? "even" : "odd";
		       
		        System.out.println(number + " is " + evenOdd);

	}

}




















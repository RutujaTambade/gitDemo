package Example;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}

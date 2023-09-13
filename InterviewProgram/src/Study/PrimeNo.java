package Study;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prime number");
		num=sc.nextInt();
		
		boolean flag =false;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		 if (!flag)
			    System.out.println(num + " is a prime number.");
			  else
			    System.out.println(num + " is not a prime number.");
	}

}



/*A prime number is a number that is divisible by only two numbers: 1 and itself. 
 * So, if any number is divisible by any other number, it is not a prime number.

*/














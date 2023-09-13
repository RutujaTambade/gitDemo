package Handle;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		try{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int Number=sc.nextInt();
     System.out.println("Enter the number2");
     int Number1=sc.nextInt();
     int result=Number+Number1;
     
     System.out.println(result);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("catch is execute");
		}
		
		finally{
			
		System.out.println("Thankyou");
     
			
		}
	}
}
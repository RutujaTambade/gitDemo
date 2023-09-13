package Abc;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your name:");
			 String name=s.nextLine();
			 
			 System.out.println("Enter your age:");
			 int age=s.nextInt();
			
			 System.out.println("Enter your salary:");
			 double salary=s.nextDouble();
			 
			 System.out.println("Name:"+name);
			 System.out.println("Age:"+age);
			 System.out.println("Salary:"+salary);
			 
			 
			
		}
	}

}

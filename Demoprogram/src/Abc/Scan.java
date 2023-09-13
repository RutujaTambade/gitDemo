package Abc;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First id");
		  int fid=sc.nextInt();
		
		System.out.println("Enter First Name");
		  String fname=sc.next();
		  
		  System.out.println("Enter the Address");
		  String Add=sc.next();
		  
		  System.out.println("id: " + fid );
		  System.out.println("name: " + fname);
		  System.out.println("Address: "+ Add);
          
	}

}

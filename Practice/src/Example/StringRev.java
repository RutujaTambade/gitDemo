package Example;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str;
	    char ch;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of string");
	  str= sc.nextLine();
	   System.out.println("reverse string ");
	  
		  for(int i=str.length(); i>0; --i)
	  
		  {
			  System.out.println(str.charAt(i-1));
		  }
		
		  

	}

	}



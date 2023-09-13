package Abc;

import java.util.Scanner;

public class RevNumber {
	// TODO Auto-generated method stub
    int n,rev=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number");
    n=sc.nextInt();
    
    while(n!=0) 
    {
   	 rev=rev*10;
   	 rev=rev+n%10;
   	 n=n/10;
   	 }
    System.out.println("enter the reverse number" +rev);
        
	}

}

package Study;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number a and b");
   a = sc.nextInt();
    b=sc.nextInt();
    System.out.println( "after swaping "+a+" "+b);
     c=a;
    a=b;
     b=c;
     
     System.out.println("before swapping"+a+" "+b);
     
	}

}

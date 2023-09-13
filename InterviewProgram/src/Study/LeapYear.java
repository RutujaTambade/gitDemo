
package Study;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		int year=sc.nextInt();
      // int year=2004;
       
		
       if((year%400== 0)||((year%4==0) &&(year%100!=0)))
       {
       System.out.println(year + "is a leap year");
       }
       else
    	   System.out.println(year + "is not a leap year");
	}

}



package Study;

import java.util.Scanner;

public class Armastrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n, c,rem,arm=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Aramstrong number");
      n =sc.nextInt();
      c=n;
      while(n>0) {
    	  rem=n%10;
    	  
    	  arm=(rem*rem*rem)+arm;
    	  n=n/10;
      }
      if(c==arm)
    	  System.out.println("Armstrong number");
      else {
    	  System.out.println("its not Armstrong number");
    	  
      }
	}

}

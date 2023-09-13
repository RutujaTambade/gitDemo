package Program;

import java.util.function.Predicate;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int number = 11;
		
		Predicate<Integer> p=(i)->number%2==0;
	     if (p.test(13))
	      {
	    	  System.out.println("it is even no");
	      }
	      else {
	    	  System.out.println("it is odd no");
	      }

	
	}
}

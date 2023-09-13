package Handle;

import java.util.Scanner;

public class CustomExceptionAtm extends Exception{
	
	 public CustomExceptionAtm(){
		 
	super("Insufficient Balance");
	}
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pass,tb=40000,wa,r;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Atm Pin");
      pass=sc.nextInt();
      try {
    	  if(pass==4552) {
    		  System.out.println("Enter 1 for balance check");
    		  System.out.print("Enter 2 for Amount withdraw");
    		   int n=sc.nextInt() ;
    		switch(n) {
    		case 1:
    			System.out.println("you are balance is:"+tb);
    			break;
    		case 2:
    			System.out.println("Enter the Amount for withdraw");
    			Scanner s=new Scanner(System.in);
    			wa=s.nextFloat();
    		if(wa>=tb) {
    			
    			throw new CustomExceptionAtm();
    			
    		}
    		else {
    			System.out.println("Your Amount is withdraw:"+wa);
    			
    		 r=tb-wa;
    		 
    		 System.out.println("Remaining balance is " + r);
    			
    			
    		}
    		break;
    		default:
    			System.out.println("choose the correct input");
    		}
    	  }
    	  
    		else {
    			System.out.println("enter correct password:");
    		}
      }
      catch(Exception e){
    	  System.out.println(e.getMessage());
      }
      finally {
    	  System.out.println("Thank you for visiting");
    			
    		}
     
    	  }
	}

	



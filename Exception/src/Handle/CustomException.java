 package Handle;
import java.util.Scanner;

public class CustomException extends Exception {
	public CustomException(String s)
	{
		super(s);
	}



	public static void main(String[] args) {
		try{
		int a=1000;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int values=sc.nextInt();
     if(a>=1000) {
    	 
    	 throw new CustomException("s");
     
     }
     else {
    	 System.out.println("withdraw the value");
     }
		}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    		
			
		}	

}
}
package Study;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int numbers[]=new int[] {121,13,89,45,13,34,11,22,54,16,4,9};
         for(int i=0;i<numbers.length;i++) {
        	 int number=numbers[i];
        	 int reversedNumber=0;
        	 int temp=0;
        	 while(number>0) {
        		 temp=number%10;
        		 number=number/10;
        		 reversedNumber=reversedNumber*10+temp;
        	 }
        	 if(numbers[i]==reversedNumber)
        		 System.out.println(numbers[i]+" = is palindrome");
        	 else
        		 System.out.println(numbers[i] +" = not a palindrome");
         }
	}

}

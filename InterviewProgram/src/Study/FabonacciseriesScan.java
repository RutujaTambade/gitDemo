package Study;

import java.util.Scanner;

public class FabonacciseriesScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=0,b=1,c=1;
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the values");
		 num = sc.nextInt();
		System.out.println("Fabonaccies series");
	 	for(int i=1;i<=num;i++)
		{
			
	 		
	 		
	 		
	 		a=b;
			b= c ;
			c=a+b;
			System.out.println(a+"");
			
			
		}
		

	}

}

/*class GFG {
static int fib(int n)
{
    if (n <= 1)
        return n;

    return fib(n - 1)
    + fib(n - 2);
}
  public static void main(String args[]){
   
    int N = 10;

    for (int i = 0; i < N; i++) {

        System.out.print(fib(i) + " ");
    }
}
}*/
package Program;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number print line");
	
		int n=sc.nextInt();
		
		for( int i=1;i<=n; i++)
		{
			int abcd=65;
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)abcd);
				abcd++;
			}
			System.out.println();
		}
	
	}

}

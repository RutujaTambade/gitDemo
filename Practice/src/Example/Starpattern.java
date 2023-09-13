package Example;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==3|| i==5)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(j);
				}
			}System.out.println(" ");
		}

	}

}

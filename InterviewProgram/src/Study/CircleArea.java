package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius=0;
		System.out.println("please enter radius of a circle");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			radius=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid radius value "+ne);
			
		}
		catch(Exception ioe)
		{
			System.out.println("Io error:"+ioe);
			System.exit(0);
			
		}
		double area=Math.PI*radius*radius;
		System.out.println("Arae of a circle is "+area);

	}

}

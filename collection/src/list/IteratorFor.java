package list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,5,9,7,4,5,3,2,6,78,87);
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i)+" ");
			//System.out.println(numbers.set(i, 3)+" ");
		}

	}

}

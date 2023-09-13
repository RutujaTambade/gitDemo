package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_Stream {

	public static void main(String[] args) {
		 List<Integer> salary=Arrays.asList(1000,900,3000,400);
		 List<Integer> newsalary=new ArrayList<Integer>();
		
//		 for(int i:salary) {
//			 newsalary.add(i+4000);
//		 }
//		 System.out.println("increase salary"+newsalary);
	
		newsalary=salary.stream().map(n->n*2).collect(Collectors.toList());
		
		newsalary=salary.stream().sorted().collect(Collectors.toList());
	    
		
		
		System.out.println(newsalary);
		 System.out.println("after sort"+newsalary);
			
	}
	}

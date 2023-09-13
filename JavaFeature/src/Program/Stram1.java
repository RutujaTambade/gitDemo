package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(l);
		 
       List<Integer> al=new ArrayList<>();
       List<Integer> all=new ArrayList<>();
		
	al = l.stream().filter(o->o%2==0).collect(Collectors.toList());
	all = l.stream().filter(v->v%2==1).collect(Collectors.toList());
	
	System.out.println(al);
		
	System.out.println(all);
	

			
		
				

	}

}

package Program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=Arrays.asList(23,45,67,87,23,56,78);
     
  Optional<Integer> op=   list.stream().min((min1,min2)->{
    	 return min1.compareTo(min2);
     });
     System.out.println("min value:"+op.get());
     
	//-----------------------Max======================

	
	 Optional<Integer> op1= list.stream().max((max1,max2)->{
    	 return max1.compareTo(max2);
     });
     System.out.println("max value:"+op1.get());
	

		list.stream().limit(4).forEach(value-> System.out.println(value));
//------------------------------------------------------------------------		
	//collection deal with object so object write
		Object [] obj=list.stream().toArray();
		
		System.out.println(obj);
	//====================================================	
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}

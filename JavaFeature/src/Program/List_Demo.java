package Program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List<String> list=Arrays.asList("rutu","pradnoo","34","78","Niki","d","a");
		
		
Optional<String> op1= list.stream().reduce((a,b)->{
	    	 return a+b;
	     });
	     System.out.println("Reduce value:"+op1.get());
		
	}

}

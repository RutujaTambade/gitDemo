package Program;

import java.util.Arrays;
import java.util.List;

public class Non_Terminal {

	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("Rutuja","Neha","Pradnya","Nikita","Sejal");
		//dublicate data remove use distinct.
		list.stream().distinct().forEach(value-> System.out.println(value));
		
		long count=list.stream().distinct().count();
		System.out.println("count value:"+count);
	}
}

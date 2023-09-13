package list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class DuplicateDataList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> a=new ArrayList<String>();
      
     a.add("HI");
     a.add("Hello");
     a.add("Micro");
     a.add("HI");
     a.add("CLASS");
     System.out.println(a);
 	 Set<String> s=new LinkedHashSet<String>(a);
 	 
 	 System.out.println(s);
	}


}

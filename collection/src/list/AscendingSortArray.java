package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AscendingSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> list=new ArrayList<String>();
         list.add(" A Micro");
         list.add("Learning");
         list.add("class");
         list.add("Pune");
         
         System.out.println("unsorted ArrayList:"+list);
         
         Collections.sort(list);
         
         System.out.println("Sorted Arraylist" + " in Ascending order:" + list);
         
         Collections.sort(list);
         System.out.println("sorted Arraylist" + " in dscending order :" + list);
         
	}

}
//Collections.sort(al,Collections.reverseOrder());
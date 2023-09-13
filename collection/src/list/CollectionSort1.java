package list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		 al.add("nutan");
	      al.add("shruta");
	      al.add("sejal");
	      al.add("sayli");
	      al.add("rutuja");
	      al.add("Ankita");
	      al.add("nikita");
	      al.add("neha");
	      
	       System.out.println(al);
	      
	      Collections.sort(al);
	      
	      
	      System.out.println(" collections sort():\n"+al);
	      
	      Collections.sort(al,Collections.reverseOrder());
	      
	      System.out.println(" collections sort reverse order:\n"+al);
	}

}

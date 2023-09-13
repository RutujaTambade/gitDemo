package list;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al=new ArrayList<>();
      al.add("rutuja");
      al.add("Niks");
      al.add(123);
      al.add('A');
      al.add('@');
      al.add(12.5);
      al.add("rututambade@gmail.com");
      al.add("nikubhor@gmail.com");
      al.remove(3);
      al.size(); 
      
      al.addAll(al);
    //  System.out.println(al);
      Iterator i=al.iterator();
      while(i.hasNext())
      {
    	  System.out.println(i.next());
      }
      
      
	}

}

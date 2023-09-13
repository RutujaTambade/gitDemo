package list;

import java.util.Iterator;
import java.util.LinkedList;

public class javaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList<>();
		l.add("Micro");
		l.add("Learning");
		l.add("class");
		l.add('a');
		l.add(1234);
		l.add(45.8);
		l.add("abc@gmail.com");
		l.remove(4);
		l.addFirst(3);
		l.addLast("exit");
		
		
		//System.out.println(l);
		Iterator i=l.iterator();
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	      }

	}

}

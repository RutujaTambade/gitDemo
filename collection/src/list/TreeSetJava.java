package list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>();
		
	 t.add("Pradnya");
	 t.add("Nikita");
	 t.add("Rutuja");
	 t.add("Shital");
	 t.add("Nikita");
	 t.addAll(t);
	
	 System.out.println(t);
	 
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

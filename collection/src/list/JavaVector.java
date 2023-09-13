package list;

import java.util.Iterator;
import java.util.Vector;

public class JavaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector<>();
		v.addElement("Micro");
		v.addElement("Learning");
		v.addElement("class");
		v.addElement('a');
		v.addElement(1234);
		v.addElement(45.8);
		v.addElement("abc@gmail.com");
		v.removeElementAt(4);
		v.addElement('v');
		v.addElement("exit");
		
		
		//System.out.println(l);
		Iterator i=v.iterator();
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	      }



	}

}

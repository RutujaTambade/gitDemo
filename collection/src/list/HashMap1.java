package list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap hm=new HashMap<>();
       
     hm.put(1,"rutuja");
     hm.put(2,"Nikita");
     hm.put(3,"Shital");
     hm.putAll(hm); 
     hm.put(4,"Pradnya");
     hm.put(5, "Niks");
     
     System.out.println(hm);
     Set s=hm.entrySet();
 	Iterator i=s.iterator();
	while(i.hasNext())
	{
    // System.out.println(i.next());
		Map.Entry m=(Map.Entry)i.next();
		System.out.println(m.getKey()+" "+m.hashCode()+" "+m.getClass());
	}
	
	}
}

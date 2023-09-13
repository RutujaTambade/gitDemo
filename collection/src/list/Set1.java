package list;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<String> languages=new HashSet<>();
       languages.add("c");
       languages.add("python");
       languages.add("javascript");
       
       System.out.println("Set:"+languages);
       
       System.out.println("Iterating set of data ");
       for(String language:languages)
       {
		System.out.println(languages);
		
       }

	}

}

package list;

import java.util.Iterator;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(123);
		s.push(456);
		s.push(789);
		s.push(101);
		//s.pop();
		s.peek();
		s.search(2);
		s.empty();
		
		
		System.out.println(s);
		
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}

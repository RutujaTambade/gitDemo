package list;

import java.util.Iterator;
import java.util.LinkedList;

class Student{
	int id;
	 String name;
	 String email;
	 String MobNumber;
	 
	public Student(int id,String name,String email,String MobNumber )
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.MobNumber=MobNumber;
	}

}
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d=new Student(1,"rutu","rutu@gmail.com","2345678934");
		Student d1=new Student(2,"niks","niks@gmail.com","345678932");
		Student d2=new Student(3,"shital","shital@gmail.com","5674432678");
		Student d3=new Student(4,"nikita","nikita@gmail.com","4678964368");
		Student d4=new Student(5,"pradnya","prabhor@gmail.com","875326905");
		
		LinkedList<Student> al=new LinkedList<Student>();
		al.add(d);
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		
		
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Student D=(Student)i.next();
			System.out.println(D.id+" "+D.name+" "+D.email+" "+D.MobNumber);
		}

	}

}

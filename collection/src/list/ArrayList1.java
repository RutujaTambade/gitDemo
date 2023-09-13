package list;

import java.util.ArrayList;
import java.util.Iterator;

class Demo{
	 
	 int id;
	 String name;
	 String email;
	 
	public Demo(int id,String name,String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
 }
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo(1,"rutu","rutu@gmail.com");
		Demo d1=new Demo(2,"niks","niks@gmail.com");
		Demo d2=new Demo(3,"shital","shital@gmail.com");
		Demo d3=new Demo(4,"nikita","nikita@gmail.com");
		Demo d4=new Demo(5,"pradnya","prabhor@gmail.com");
		
		ArrayList<Demo> al=new ArrayList<Demo>();
		al.add(d);
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Demo D=(Demo)i.next();
			System.out.println(D.id+" "+D.name+" "+D.email);
		}

	}

}

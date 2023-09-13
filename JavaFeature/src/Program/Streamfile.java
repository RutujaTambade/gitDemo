package Program;

import java.util.ArrayList;
import java.util.List;

class Emp{
     
	 int id;
	 String name;
	 int salary;
	 
	 Emp(int id, String name,int sal) {
		 this.id=id;
		 this.name=name;
		 this.salary=sal;
			 
	 }

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 
 }
public class Streamfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> list= new ArrayList<>();
		
		list.add(new Emp(1,"rutu",20000));
		list.add(new Emp(2,"Neha",30000));
		list.add(new Emp(3,"sejal",40000));
		list.add(new Emp(4,"shruta",50000));
		list.add(new Emp(5,"niks",60000));
		
   list.stream().filter(o -> o.salary >=40000 && o.id>=4).forEach(System.out:: println);		

	}

}

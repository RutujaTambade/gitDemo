package Abc;

public class Constructor2 {
	int id;
	String Name;
	
	public Constructor2(int i,String N)
	{
		id=i;
		Name=N;
	}
	
  void display() {
	  
	  System.out.println(id+" "+Name);
	   
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Constructor2 c=new Constructor2(11,"Rutuja");
       Constructor2 c1=new Constructor2(12,"Sejal");
       
       c.display();
       c1.display();
	}

}


package list;

public class PrameterizedCon {
   
	int id;
	String name;
	String email;
	
	PrameterizedCon(int i,String n,String e)
	{
		id=i;
		name=n;
		email=e;
	}
	void display ()
	{
	System.out.println(id+""+name+""+email);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrameterizedCon con=new PrameterizedCon(11, " rutuja " , "rututamabde@gmail.com");
		PrameterizedCon con1=new PrameterizedCon(12, " nikita " , "nikubhor@gmail.com");
		
		con.display();
		con1.display();
		con.getClass();
	}
	
}

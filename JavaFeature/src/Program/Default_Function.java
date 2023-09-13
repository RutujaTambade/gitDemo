package Program;
public interface Default_Function {
  

	public void run();

	public void walk();

	
	default void dispaly() {
		System.out.println(" Default method..");
	}
	
   static void n() {
	   System.out.println("static method ....");
   }

class Wild implements Default_Function {
	public void run() {
		{
			System.out.println("Animals have four legs ");
		}
	}

	public void walk() {
		{
			System.out.println("Walking.....");
		}
		
		
	}
	
	public void display() {
		Default_Function.super.dispaly();
	}
	
	}
public static void main(String[] args) {
		
	Wild w =new Wild();
	   w.run();
	   w.walk();
	  
	Default_Function d=new Wild();
	d.dispaly();
   
	
	Default_Function.n();
		
	}

	}

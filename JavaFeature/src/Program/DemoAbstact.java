package Program;
 abstract class Display{
	  abstract void M();
	  public void Display() {
		  System.out.println("Non abstact method");
	  }
	  
 }
public class DemoAbstact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display() {
			
			public void M() {
				System.out.println("this is overriden method from display");
			}
		};
		d.M();
		System.out.println(d.getClass().getName());
		 
	}

}

package Program;

public interface InterfaceEx {
    
	public void m();
	
}
 class Test implements InterfaceEx{
	 
	 public void m() {
		 System.out.println("abstract class body");
	 }
	 public static void main (String[]args) {
		  
		 Test t=new Test();
		 t.m();
	 }
 }

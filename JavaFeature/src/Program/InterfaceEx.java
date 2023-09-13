
package Program;

public interface InterfaceEx {
    
	 void m( int a,int b);
	
   public static void main(String[]args) {
	 
	   InterfaceEx f=(a,b)->{
		   System.out.println(a+b);
    
	   };
	   f.m(5, 8);
	   
	//------Runnable
	   
	   Runnable t1=()->{
			for(int i=3; i<=20;i++) {
				System.out.println(i);
			}
		};
		Thread t2=new Thread(t1);
		t2.start();
	   }
   
 }

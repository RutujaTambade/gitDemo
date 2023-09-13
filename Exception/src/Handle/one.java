package Handle;

class Bank{
	
	public  void m() {
		
		for(int i=0;i<=10;i++) {
			{
				for(int j=1; j<=i; j++)
				{
			}
			
			System.out.println(i);
		}
		synchronized (this) {
			System.out.println("hii");
			System.out.println("hello");
			System.out.println("Rutuja");
		}
			
		}
		}     
}
 
public class one extends Thread{
	Bank B =new Bank();
	
	public void run() {
		 B.m();
		 System.out.println("ABC");
		 System.out.println("XYZ");
	 }
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
          one o=new one();
          o.start();
	}

}

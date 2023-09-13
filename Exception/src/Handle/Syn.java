package Handle;

   public class Syn{
	int total_seat=10;
	  synchronized public void book_seat(int seats) {
		  if(total_seat>=seats) {
			  System.out.println("ticket is  booking sucessfully ");
			  
			  total_seat=total_seat-seats;
			  
			  System.out.println("reamining seats:"+total_seat);
		  }
		  else {
			  System.out.println("ticket is  booking unsucessfully");
			  System.out.println("remaining seats:"+total_seat);
		  }
	  }
  }
	
 class MyThread extends Thread{
	 static Syn a;
	int seats;
	  public void run()
	  {
		  a.book_seat(seats);
	  }
	  
  
public class Synchronized{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  a = new Syn();
		  MyThread m=new MyThread();
		  Thread t=new Thread(m);
		  m.seats=7;
		  
		  m.start();

	}
}
 }


  

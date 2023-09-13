package Handle;
  class A1{
	  int total_Amount=40000,Balance;
	  synchronized public void withdraw_Balance(int Balance) {
		  if(total_Amount>=Balance) {
			  System.out.println("balance is successfully withdraw");
			  
			  total_Amount=total_Amount-Balance;
			  
			  System.out.println("remaning balance:"+total_Amount);
		  }
		  else {
			  System.out.println("balance is unsuccessfully withdraw");
			  System.out.println("remaining balance:"+total_Amount);
		  }
	  }
  }
public class Banking extends Thread {
	static A1 a;
	int Amount;
	
	public void run() {
		a.withdraw_Balance(Amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     a=new A1();
     Banking B=new Banking();
     Thread T=new Thread(B);
     T.setName("pradnya");
     
     Thread T1=new Thread(B);
     T1.setName("Rutuja");
     T.start();
     T1.start();
     
     
     B.Amount=2000;
     Banking B1=new Banking();
     Thread T4=new Thread(B1);
     B1.Amount=39000;
     B.start();
     //B.start();
	}

}

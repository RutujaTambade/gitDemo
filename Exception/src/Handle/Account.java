package Handle;

public class Account {
	private int balance=30000,tb,wa,r;
	public int getBalance(){
		return balance;
		}
	public void withdraw(int amount) {
		balance=balance-amount;
	}
	public void run() {
		for(int i=1;i<=2;i++)
		{
			if(wa>=tb) {
    			System.out.println("Enter the Amount of withdraw");
    		}
    		else {
    			System.out.println("Your Amount is withdraw:"+wa);
    		 r=tb-wa;
    		 System.out.println("Remaining balance is " + r);
    			
    			
    		}
    		
			
		}
	}
	
	public class Person extends Thread{
		
		public void run() {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

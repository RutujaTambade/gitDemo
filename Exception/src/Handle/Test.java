package Handle;

public class Test implements Runnable {
	
	public void run() {
		System.out.println("thread is runnable....");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Thread th=new Thread(t);
		th.start();

	}

}

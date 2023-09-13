package Handle;

public class FirstThread extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
   
	public static void main(String[] args){
		// TODO Auto-generated method stub
		FirstThread F=new FirstThread();
		F.start();
		Thread T=new Thread(F);
		T.getName();

	}

}

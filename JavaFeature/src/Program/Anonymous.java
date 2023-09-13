
package Program;

abstract class Anonymous {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Runnable r= new Runnable() {
			
			@Override
			public void run() {
			   for(int i=0; i<=10; i++)
				System.out.println(i);
			}
		};
//----------using Lambda Expression---------------------------
		
		Runnable t1=()->{
			for(int i=3; i<=20;i++) {
				System.out.println(i);
			}
		};
		Thread t=new Thread(r);
		Thread t2=new Thread(t1);
		//r.run();
		t.start();
		t2.start();
			
		
	}

}

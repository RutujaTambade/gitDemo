package Abc;

 abstract class vehicle{
	 public abstract void run();
	public void start(){
   
	   System.out.println("car starts with key");
	   }
   }
   class Scooter extends vehicle{
   
	    public void run(){
	   {
		   System.out.println("Scooter starts with kick");
		   
	   }
	   
	    }
	   
   public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scooter sc=new Scooter();
		sc.run();
        sc.start();
	}

}

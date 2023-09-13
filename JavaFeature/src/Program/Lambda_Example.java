package Program;

public interface Lambda_Example {
   
	void Add(int a);
	
	 
	default void  run() {
		 for(int i=0; i<10; i++);
	 }
	 
	 
	
	public static void main(String[]args) {
		
		Lambda_Example l=(a)->{
		System.out.println(a);
	
		};
		l.Add(68);
		l.run();
	}
}

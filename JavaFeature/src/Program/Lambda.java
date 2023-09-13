package Program;

public interface Lambda {
	
	void show(int a);
	
	static void print() {
		System.out.println("static method");
	}
	default void display() {
		System.out.println("deafault method");
	}
   
	public static void main (String[]args) {
		
		Lambda l=(int a)-> {
			System.out.println(a);
		};
		
		l.show(100);
		print();
		l.display();
		
		
		
		
	}
    
    
    
}

package Program;

public interface Interface_Example {

	
	 void Add();
	 
	 public static void main(String args[]) {
		 
		 Interface_Example a= new Interface_Example() {
			
		@Override
			public void Add() {
				System.out.println("hiiiii");
			}
		};
		a.getClass().getName();
	 }
}


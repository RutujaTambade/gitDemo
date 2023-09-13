package Program;

 public class SingleObject {
	 
      private static SingleObject s=new SingleObject();
      private SingleObject() { }
      public static SingleObject gets() {
    	  return s;
      }
	  
      public void showmessage() {
    	  System.out.println("hello java");
      }
      public static void main (String []args) {
    	   SingleObject s1=new SingleObject();
    	   s1.showmessage();
      }
	}


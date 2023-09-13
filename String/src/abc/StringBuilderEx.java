package abc;

public class StringBuilderEx {

	private static final Object Test1 = null;
	private static final Object Test = null;
	private static final Object Test3 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          StringBuilder sb=new StringBuilder("hello");
        // sb.insert(2, "java");
         sb.length();
         // sb.delete(1, 3);
          //sb.reverse();
        // int capacity=sb.capacity();
       //  sb.capacity();
       //  sb.equals(sb);
         Object s1=Test1;
		Object s2 = Test3;
		System.out.println(s1==s2);
		System.out.println(s1.toString()==s2.toString());
		if(s1.toString()==s2.toString())
	System.out.println("true");
		
          //System.out.println(sb);
        //  System.out.println("capacity of stringBuilder="+capacity);
	}

}

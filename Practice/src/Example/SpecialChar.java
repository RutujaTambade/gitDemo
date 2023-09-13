package Example;

public class SpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="GOOD@#MORNING$25&ALL#@OF!YOU&#";
		
		 
		s=s.replaceAll("[^a-z A-Z 3-9]"," ");
		 
		 System.out.println(s);

	}

}




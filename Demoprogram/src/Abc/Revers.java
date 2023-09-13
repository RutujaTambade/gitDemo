package Abc;

public class Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String str="Rutuja", nstr1="";
	 char ch;
	 
	 {
	 System.out.println("orignal word:");
	 System.out.println("RUTUJA");
	 
		 for(int i=0;i<str.length(); i++)
		 {
		ch=	str.charAt(i);
		 nstr1=ch+nstr1;
	 }
	 System.out.println("reverse word: "+ nstr1);

	}
}
}




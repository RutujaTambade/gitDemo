package Study;

public class Reve_Word {

	public static void main(String[] args) {
		
		String str1="Hello ", str2="word";
		System.out.println("String before swapping:"+str1+" "+str2);
		
		str1=str1+str2;
		
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println("string after swapping:"+str1+ " "+str2);
	}
	
	}


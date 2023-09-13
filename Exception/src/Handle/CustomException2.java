package Handle;

 import java.util.ArrayList;
 import java.util.Arrays;

//import Handle.CustomException2.Main;

public class CustomException2 extends Exception{
	
	public CustomException2(String msg)
	{
		super(msg);
	}

public class ExceptionChecked1{

	ArrayList<String> languages=new ArrayList<>(Arrays.asList("java","python","Javascript"));
	public void checkeLanguage(String language)throws CustomException2{
		if(languages.contains(language))
		{
			throw new CustomException2(language+"already exit");
		}
		else {
			languages.add(language);
			System.out.println(language +"is added to the arrayList");
			
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException2 obj=new CustomException2(null);
		try {
			obj.checkeLanguage("Swift");
			obj.checkeLanguage("java");
		}
		catch(Exception e) {
			System.out.println("["+ e+"]Exception occured");
		}
		
	}
	private void checkeLanguage(String string) {
		// TODO Auto-generated method stub
		
	}

}

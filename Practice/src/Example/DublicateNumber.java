package Example;

public class DublicateNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rutuja";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++)

			for (int j = i + 1; j < s.length(); j++)
         
			{
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
				}
			}

	}
 
}


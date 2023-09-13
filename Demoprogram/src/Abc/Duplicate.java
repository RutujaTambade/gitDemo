package Abc;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= new int[] {10, 49,30,20,10,30};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
	}

}

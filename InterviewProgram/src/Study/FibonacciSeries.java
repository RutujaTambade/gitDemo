package Study;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int limit=10;
          long[]series=new long[limit];
          series[0]=0;
          series[1]=1;
          for(int i=2;i<limit;i++)
          {
        	  series[i]=series[i-1]+series[i-2];
          }
          System.out.println("fabonacci series upto 0 to"+limit);
          for(int i=0;i<limit;i++) {
        	  System.out.println(series[i]+"");
          }
	}

}



/*int num,a=0,b=0,c=1;
Scanner sc =new Scanner(System.in);
sop("enter the number of times ");
int num=sc.nextInt();
sop("fabonacciseries of the number is:");
for(int i=0li<num;i++){
a=b;
b=c;
c=a+b;
sop(a+" ");
}}
}*/
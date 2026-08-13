public class FibonacciSeries{
	public static void fibo(int first,int last,int n){
		int a=first;
		int b=last;
		for(int i=1;i<=n;i++){
			System.out.print(a+" ");
			int next=a+b;//c=1
			a=b;
			b=next;

		}
	}
	public static void main(String[] args){
		int a=5;
		int b=6;
		int n=5;
		fibo(a,b,n);
	}
}
import java.util.Scanner;
class Fibonacci
{
	static int fib(int n){
		if(n==1 || n==2)
			return n==1?0:1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) 
	{
		//Scanner sn=new Scanner(System.in);
		//int n=sn.nextInt();
		for(int i=1;i<=10;i++)
		System.out.println(fib(i));
	}
}

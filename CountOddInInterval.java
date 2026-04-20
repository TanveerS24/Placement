import java.util.Scanner;
class CountOddInInterval 
{
	static int ans(int low,int high){
		return (low%2==0 && high%2==0)?(high-low)/2:(high-low)/2+1;
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Hey man enter a number");
		int low=sn.nextInt();
		int high=sn.nextInt();
		System.out.println(ans(low,high));
	}
}

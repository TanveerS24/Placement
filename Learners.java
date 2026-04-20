import java.util.Scanner;
class Learners 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any no.");
		int num=sc.nextInt();
		System.out.println(num%2==0?"Even":"Odd");
	}
}
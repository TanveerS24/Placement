import java.util.Scanner;
class Replace 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.replace(s.charAt(0)+"",""));
		System.out.println(s.equals("tanveer"));
	}
}

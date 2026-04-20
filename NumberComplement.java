import java.util.Scanner;
class NumberComplement
{
	static int complement(int num){
		StringBuilder sb=new StringBuilder(Integer.toBinaryString(num));
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='0')
				sb.setCharAt(i,'1');
			else
				sb.setCharAt(i,'0');
		}
		return Integer.parseInt(sb.toString(),2);
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Hey man enter a number");
		int num=sn.nextInt();
		System.out.println(complement(num));
	}
}

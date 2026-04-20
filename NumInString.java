import java.util.Scanner;
class NumInString 
{
	static String sum(String str){
		int num=0;
		String current="";
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				current+=str.charAt(i);
			}
			else if(current!=""){
				num+=Integer.parseInt(current);
				current="";
			}
		}
		if(current!="")
			num+=Integer.parseInt(current);
		return num+"";
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter String:");
		String x=sn.nextLine();
		System.out.println(sum(x));
	}
}
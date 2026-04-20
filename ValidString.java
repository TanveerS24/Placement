import java.util.Scanner;
class  ValidString
{
	static boolean checker(String str){
		int len=str.length();
		if(!(Character.isLetter(str.charAt(0))) || len==0){
			return false;
		}
		for(int i=1;i<len;i++){
			if(!(Character.isLetter(str.charAt(i))) && !(Character.isDigit(str.charAt(i))) && str.charAt(i)!='_')
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter String:");
		String x=sn.nextLine();
		System.out.println(checker(x)?"Valid":"Invalid");
	}
}

import java.util.Scanner;
class Cryptographer 
{
	static String decrypt(String s){
		char[] temp=s.toCharArray();
		for(int i=0;i<temp.length;i++){
			if(temp[i]=='a')
				temp[i]='z';
			else
				temp[i]-=1;
		}
		return new String(temp);
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter your ancient text:");
		String s=sn.nextLine();
		System.out.println("The Decrypted message is as follows:"+decrypt(s));
	}
}
import java.util.Scanner;
class Substring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char []t=a.toCharArray();
		boolean c=true;
	 for(int i=0;i<t.length-1;i++){
		 if(t[i]=='b' && t[i+1]=='a')
			 c=false;
	
         else
			 c=true;
	 }
	 
	 System.out.print(c);
}
}
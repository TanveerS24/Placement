import java.util.Scanner;
class FirstUnique 
{
	public static int firstUniqChar(String s) {
        int i;
		String temp;
        for(i=0;i<s.length();i++){
			temp=s.substring(0,i)+s.substring(i+1,s.length());
            if(!temp.contains(s.charAt(i)+""))
                return i;
        }
        return -1;
    }
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		System.out.println(firstUniqChar(s));
	}
}

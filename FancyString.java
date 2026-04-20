import java.util.Scanner;
class FancyString
{
	static String fancyString(String s){
		StringBuilder sb=new StringBuilder();
        int count=1;
		sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
			}
			else{
				count=1;
			}
			if(count<=2){
				sb.append(s.charAt(i));
			}
        }
		return new String(sb);
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		System.out.println(fancyString(s));
	}
}

class LongestPalindrome 
{
	public static int pal(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return 0;
		}
		return s.length();
	}
	public static void main(String[] args) 
	{
		String s="Tanveer";
		int i,j;
		int big=0,cur=0;
		String temp;
		for(i=0;i<s.length();i++){
			for(j=i+1;j<=s.length();j++){
				temp=s.substring(i,j);
				cur=pal(temp);
				big=big>cur?big:cur;
			}
		}
		System.out.println(big);
	}
}

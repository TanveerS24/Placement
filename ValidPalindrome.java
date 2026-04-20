class ValidPalindrome 
{
	static boolean validPalindrome(String s){
		StringBuilder s1=new StringBuilder("");
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
				s1.append((s.charAt(i)+"").toLowerCase());
		}
		String s2=s1.reverse().toString();
		return s2.equals((s1.reverse()).toString());
	}
	public static void main(String[] args) 
	{
		System.out.println(validPalindrome("A man, a plan, a canal: Panama")?"palindrome":"no");
	}
}

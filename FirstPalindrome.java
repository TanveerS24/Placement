class FirstPalindrome 
{
	static String firstPalindrome(String[] words){
		for(int i=0;i<words.length;i++){
			if(palindrome(words[i]))
				return words[i];
		}
		return "";
	}
	static boolean palindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(firstPalindrome(new String[]{"Hello","World","mom"}));
	}
}

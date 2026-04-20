class ValidPalindrome2 
{
	static boolean validPalindrome(String s){
		int left=0;
		int right=s.length()-1;
		int len=s.length();
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return (palindrome(s,left+1,right) || palindrome(s,left,right-1));
			}
			left++;
			right--;
		}
		return true;
	}
	static boolean palindrome(String s,int left,int right){
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(validPalindrome("cbbcc")?"palindrome":"no");
	}
}

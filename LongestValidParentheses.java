class LongestValidParentheses 
{
	static int LongestValidParentheses(String s){
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				s1+=s.charAt(i)+"";
			}
			else if(s1.length()!=0){
				s2+=s1+(s.charAt(i)+"");
				s1="";
			}
			System.out.println(s1+" "+s2);
		}
		return s2.length();
	}
	public static void main(String[] args) 
	{
		System.out.println(LongestValidParentheses(""));
	}
}

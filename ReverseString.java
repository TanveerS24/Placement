class	ReverseString 
{
	static void reverseString(char[] s){
		char temp;
		for(int i=0;i<s.length/2;i++){
			temp=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=temp;
		}
	}
	public static void main(String[] args) 
	{
		char s[]={'h','e','l','l','o'};
		reverseString(s);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
}

class LastWordLength 
{
	static int LastWordLength(String s){
		String []s1=s.split(" ");
		return s1[s1.length-1].length();
	}
	public static void main(String[] args) 
	{
		System.out.println(LastWordLength("Hello World"));
	}
}

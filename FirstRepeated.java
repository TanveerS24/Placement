class FirstRepeated 
{
	static char repeatedCharacter(String s){
		int count[]=new int[26];
		int pos=0;
		for(int i=0;i<s.length();i++){
			pos=s.charAt(i)-97;
			if(count[pos]==1)
				return s.charAt(i);
			count[pos]++;
		}
		return 'a';
	}
	public static void main(String[] args) 
	{
		System.out.println(repeatedCharacter("abccbaacz"));
		
	}
}

class ReverseVowels 
{
	static String ReverseVowels(String s){
		if(s.length()==0)
			return s;
		char []str=s.toCharArray();
		int []ind=new int[s.length()];
		int i,j=0;
		String vow="AEIOUaeiou";
		for(i=0;i<s.length();i++){
			if(vow.contains(s.charAt(i)+""))
				ind[j++]=i;
		}
		for(i=0;i<j/2;i++){
			char temp=str[ind[i]];
			str[ind[i]]=str[ind[j-i-1]];
			str[ind[j-i-1]]=temp; 	
		}
		return new String(str);
	}
	public static void main(String[] args) 
	{
		System.out.println(ReverseVowels("IceCreAm"));
	}
}
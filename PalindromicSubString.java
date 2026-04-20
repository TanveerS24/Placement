class PalindromicSubString 
{
	static String PalindromicSubString(String s){
		String out="";
		for(int i=0;i<s.length();i++){
			for(int j=s.length();j>i;j--){
				String s1=s.substring(i,j);
				StringBuilder sb=new StringBuilder(s1);
				sb.reverse();
				if(sb.toString().equals(s1) && s1.length()>out.length()){
					out=s1;
				}
			}
		}
		return out;
	}
	public static void main(String[] args) 
	{
		System.out.println(PalindromicSubString("aacabdkacaa"));
	}
}

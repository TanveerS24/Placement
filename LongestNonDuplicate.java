class LongestNonDuplicate 
{
	public static void main(String[] args) 
	{
		String s="abcabcbb";
		int count=0,counter=0;
		int i,j;
		String s1="";
		boolean flag;
		for(i=0;i<s.length();i++){
			for(j=i;j<s.length();j++){
				flag=s1.contains(Character.toString(s.charAt(j)));
				if(flag){
					count=count>counter?count:counter;
					counter=0;
					break;
				}
				else{
					counter++;
					s1+=s.charAt(j);
				}
			}
			s1="";
			count=count>counter?count:counter;
			counter=0;
		}
		System.out.println(count);
	}
}

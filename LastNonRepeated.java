class LastNonRepeated 
{
	static String lastNonRepeated(String s){
		String out="",last="";//out is answer string last is last letter of each word
		String str[]=s.split(" ");//splitting the input string with delimiter " "
		String temp;
		for(int i=0;i<str.length;i++){
			temp=str[i].charAt(str[i].length()-1)+"";//stores the last letter of each word
			if(!last.contains(temp)){
				out=temp;
				last+=temp;
			}
			else
				out=out.equals(temp)?"":out;
		}
		return out;
	}
	public static void main(String[] args) 
	{
		System.out.println(lastNonRepeated("Hakuna Matata Solutions"));
	}
}

class SplitString 
{
		static int splitString(String s){
			String s1="",cur="";
			int ind=0,count=0;
			for(int i=0;i<s.length();i++){
				cur+=s.charAt(i)+"";
				if(!s1.contains(cur)){
					s1+=cur+" ";
					cur="";
					count++;
				}
				else{
					cur=cur.substring(1,cur.length);
					i--;
				}
				System.out.println(s1);
			}
			if(!cur.equals(""))
				count+=1;
			return count;
		}
	public static void main(String[] args) 
	{
		System.out.println(splitString("wwwzfvedwfvhsww"));
	}
}

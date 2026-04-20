class RearrangeWords 
{
	static String arrange(String text){
		String[] s=(text.toLowerCase()).split(" ");
		String temp;
		int min;
		for(int i=0;i<s.length;i++){
			min=i;
			for(int j=i+1;j<s.length;j++){
				if(s[min].length()>s[j].length())
					min=j;
			}
			temp=s[min];
			while(min>i){
				s[min]=s[min-1];
				min--;
			}
			s[i]=temp;
		}
		StringBuilder sb=new StringBuilder(String.join(" ",s));
		sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(arrange("Keep calm and code on"));
	}
}
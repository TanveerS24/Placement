class MinLength 
{
	public static int minLength(String s){
		int len;
		while(true){
			len=s.length();
			s=s.replace("AB","").replace("CD","");
			if(s.length()==len)
				break;
		}
		System.out.println(s);
		return s.length();
	}	
	public static void main(String[] args) 
	{
		System.out.println(minLength("ABFCACDB"));
	}
}

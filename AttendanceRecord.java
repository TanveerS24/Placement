class AttendanceRecord 
{
	static boolean check(String s){
		int a=0;
		char x;
		for(int i=0;i<s.length();i++){
			x=s.charAt(i);
			if(x=='A')
				a++;
			System.out.println(a+" "+l+" "+l_count+" "+x);
		}
		return a<2&&(!s.contains("LLL"));
	}
	public static void main(String[] args) 
	{
		System.out.println(check("ALLAPPL"));
	}
}

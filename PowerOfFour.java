class PowerOfFour
{
	static boolean powerOfFour(int n){
		if(n==1)
			return true;
		while(n>4){
			if(n%4!=0)
				return false;
			n/=4;
		}
		if(n==4)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(powerOfFour(64)?"yes":"no");
	}
}

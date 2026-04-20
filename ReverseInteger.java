class  ReverseInteger
{
	public static void main(String[] args) 
	{
		int x=-12;
		System.out.println(reverse(x));
	}
	public static int reverse(int x){
		boolean negative=x<0;
		x=Math.abs(x);
		long reverse=0;
		while(x!=0){
			reverse=reverse*10+x%10;
			x=x/10;
			if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE);
				return 0;
		}
		reverse=(int)(negative?-reverse:reverse);
		if(reverse<Integer.MIN_VALUE)
			return 0;
		return reverse;
	}
}

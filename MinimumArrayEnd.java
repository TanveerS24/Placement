class MinimumArrayEnd 
{
	static long minEnd(int n,int x){
		n--;
        long res=x;
        for(long i=1;n>0;i<<=1){
            if((i & x)==0){
                res|=(n&1)*i;
                n/=2;
            }
        }
        return res;
	}
	public static void main(String[] args) 
	{
		int n=2;
		int x=7;
		System.out.println("\n"+minEnd(n,x));
	}
}

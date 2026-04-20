class DivideInt 
{
	public static int divide(int dividend,int divisor){
		double res;
		res=(double) dividend/divisor;
		return res>Integer.MAX_VALUE?Integer.MAX_VALUE:res<Integer.MIN_VALUE?Integer.MIN_VALUE:(int)res;
	}
	public static void main(String[] args) 
	{
		int a=Integer.MIN_VALUE,b=-1;
		System.out.println(divide(a,b));
	}
}
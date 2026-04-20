class SquareRoot 
{
	static int squareRoot(int n){
		while((n>>1)>0){
			n=n>>1;
		}
		return n;
	}
	public static void main(String[] args) 
	{
		System.out.println(25>>1);
	}
}

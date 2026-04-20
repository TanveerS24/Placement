class MinSteps 
{
	public static int minSteps(int n){
		int steps=0;
		for(int  factor=2;factor<=n;factor++){
			while(n%factor==0){
				steps+=factor;
				n/=factor;
			}
		}
		return steps;
	}
	public static void main(String[] args) 
	{
		MinSteps ms=new MinSteps();
		System.out.println(minSteps(10));
	}
}

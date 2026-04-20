class mithun
{
	static int a=10;
	int b=20;
	static private void mul(int a,int b){
		System.out.println(a*b);
	}
	static public void multi(int a,int b){
		mul(a,b);
	}
}
class Demo1 
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=4;
		mithun.mul(a,b);
	}
}

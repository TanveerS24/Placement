class Reverse
{
	int temp;
	public void reverse(int[] arr)
	{
		int n=arr.length;
		for (int i=0; i<=n/2; i++)
		{
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
	}
}
class Launch
{
	public static void main(String... args)
	{
		Reverse l=new Reverse();
		int[] arr={1,2,3,4,5};
		l.reverse(arr);
		for (int i:arr)
		{
			System.out.println(i);
		}
	}
}
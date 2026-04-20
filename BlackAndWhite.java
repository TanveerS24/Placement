import java.util.Scanner;
class MinimumSteps 
{
	public long minimumSteps(String s) {
		if(!s.contains("0") || !s.contains("1"))
		{
			return 0;
		}
		char[] arr=s.toCharArray();
		int n=arr.length;
		int z=arr[n-1]=='0'?n-1:n-2;
		long count=0;
		char temp='0';
		for (int i=0; i<n; i++)
		{
			if (arr[i]=='1')
			{
				int j=i;
				while(j<z)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++; 
					j++;
				}
				z--;
			}
		}
		System.out.println(new String(arr));
		return count;
	}
}
class BlackAndWhite
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		MinimumSteps ms=new MinimumSteps();
		System.out.println(ms.minimumSteps(s));
	}
}

import java.util.Scanner;
class IdenticalElementsInterval 
{
	static long[] distance(int[] arr){
		long[] dist=new long[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					dist[i]+=Math.abs(i-j);
				}
			}
		}
		return dist;
	}
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sn.nextInt();
		}
		long[] ans=distance(arr);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]);
		}
	}
}

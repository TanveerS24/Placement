import java.util.*;
class TwoArrays 
{
	public static void main(String[] args) 
	{
		int []arr={1,3};
		int []arr1={2};
		int m=arr.length;
		int n=arr1.length;
		int size=m+n;
		int []res=new int[size];
		System.arraycopy(arr,0,res,0,m);
		System.arraycopy(arr1,0,res,m,n);
		Arrays.sort(res);
		float median=(size%2==0)?((res[size/2]+res[size/2-1])/2.0f):res[size/2];
		System.out.println(median);
		for(int i=0;i<size;i++){
			System.out.println(res[i]);
		}
		System.out.println(res[size/2]+" "+res[size/2-1]);
	}
}

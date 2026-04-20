import java.util.Arrays;
class MaxGap 
{
	static int maxGap(int []nums){
		if(nums.length==1)
			return 0;
		Arrays.sort(nums);
		int len=nums.length-1;
		int out=Integer.MIN_VALUE;
		for(int i=len;i>0;i--){
			if((nums[i]-nums[i-1])>out)
				out=nums[i]-nums[i-1];
		}
		return out;
	}
	public static void main(String[] args) 
	{
		System.out.println(maxGap(new int[] {1}));
	}
}

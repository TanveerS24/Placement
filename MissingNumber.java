class MissingNumber
{
	static int MissingNumber(int[] nums){
		int i,sum=0,big=Integer.MIN_VALUE;
		for(i=0;i<nums.length;i++){
			sum+=nums[i];
			if(nums[i]>big)
				big=nums[i];
		}
		return ((big*(big+1))/2)-sum==0?big+1:((big*(big+1))/2)-sum;
	}
	public static void main(String[] args){
		System.out.println(MissingNumber(new int[] {3,0,1}));
	}
}
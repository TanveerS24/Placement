class ContinousSubarraySum 
{
	static boolean continousSubarraySum(int[] nums, int k){
		int left=0,right=nums.length-1;
		boolean flag=true;
		while(left<right){
			if(sum(nums)%k==0)
				return true;
			if(flag){
				nums[left++]=0;
				flag=!flag;
			}
			else{
				nums[right--]=0;
				flag=!flag;
			}
		}
		return false;
	}
	private static int sum(int[] nums){
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(continousSubarraySum(new int[]{23,2,4,6,7},5));
	}
}

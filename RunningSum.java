class RunningSum
{
	static int[] runningSum(int[] nums){
		int sum=0;
		for(int i=0;i<nums.length;i++){
			nums[i]+=sum;
			sum=nums[i];
		}
		return nums;
	}
	public static void main(String[] args) 
	{
		int[] nums=runningSum(new int[] {1,2,3,4});
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
}

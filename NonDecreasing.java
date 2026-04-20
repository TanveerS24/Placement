class NonDecreasing 
{
	static int totalSteps(int[] nums){
		int count=0;
		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1])
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(totalSteps(new int[] {5,3,4,4,7,3,6,11,8,5,11}));
	}
}

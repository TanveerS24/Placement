class RemoveDuplicates2 
{
	static int sol(int[] nums){
		if(nums.length<=2)
			return nums.length;
		int pos=1,count=1;
		for(int i=1;i<nums.length;i++){
			if(nums[i]!=nums[i-1])
				count=1;
			else
				count++;
			if(count<=2){
				nums[pos]=nums[i];
				pos++;
			}
		}
		return pos;
	}
	public static void main(String[] args) 
	{
		int []nums={1,1,1,2,2,3};
		int k=sol(nums);
		for(int i=0;i<k;i++){
			System.out.println(nums[i])
		}
	}
}

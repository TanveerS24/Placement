class SearchInsert 
{
	public static int searchInsert(int[] nums, int target) {
		int i;
		for(i=0;i<nums.length;i++){
			if(nums[i]==target)
				return i;
			if(nums[i]>target)
				break;
		}
		return i;
    }
	public static void main(String[] args) 
	{
		int nums[]={1,3,5,6},target=7;
		System.out.println(searchInsert(nums,target));
	}
}

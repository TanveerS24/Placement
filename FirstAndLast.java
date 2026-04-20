class FirstAndLast
{
	public  static int[] searchRange(int[] nums, int target) {
		int sol[]={-1,-1};
		for(int i=0;i<nums.length;i++){
			if(nums[i]==target){
					sol[0]=i;
					break;
			}
		}
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]==target){
					sol[1]=i;
					break;
			}
		}
		return sol;
    }
	public static void main(String[] args) 
	{
		int nums[]={1},target=1;
		int []arr=(searchRange(nums,target));
		for (int i=0;i<2 ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
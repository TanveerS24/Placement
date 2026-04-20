class MaxWidthRamp 
{
	static int maxWidthRamp(int[] nums){
		int ans=0;
		for(int i=0;i<nums.length;i++){
			for(int j=nums.length-1;j>=i+1;j--){
				if(nums[i]<=nums[j] && j-i>ans){
					ans=j-i;
					return ans;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(maxWidthRamp(new int[] {9,8,1,0,1,9,4,0,4,1}));
	}
}

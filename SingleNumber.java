class SingleNumber 
{
	static int singleNumber(int[] nums){
		int i,ans=0;
		for(i=0;i<nums.length;i++){
			ans^=nums[i];
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.println(singleNumber(new int[] {4,1,2,2,1}));
	}
}

class ContainsDuplicate
{
	static boolean containsDuplicate(int[] nums,int k){
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]==k && j-i>k)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(containsDuplicate(new int[]{1,2,3,1,2,3},2));
	}
}
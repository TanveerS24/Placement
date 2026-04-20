class RotateArray 
{
	static void rotateArray(int[] nums, int k){
		if(k>nums.length)
			return;
		int[] num=new int[nums.length-k];
		System.arraycopy(nums,nums.length-k,num,0,k);
		System.arraycopy(nums,0,nums,k,nums.length-k);
		System.arraycopy(num,0,nums,0,k);
	}
	public static void main(String[] args) 
	{
		int nums[]={-1,-100,3,99};
		rotateArray(nums,2	);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}
}

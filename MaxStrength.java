class MaxStrength 
{
	static long maxStrength(int[] nums){
		long max=Integer.MIN_VALUE;
		long cur=1;
		int arr[]=sort(nums);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==-1 || arr[i]==0)
				continue;
			cur*=arr[i];
			if(max<cur)
				max=cur;
		}
		return max;
	}
	static int[] sort(int []nums){
		int temp;
		for(int i=0;i<nums.length-1;i++){
			for(int j=i;j<nums.length;j++){
				if(Math.abs(nums[i])<Math.abs(nums[j])){
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) 
	{
		System.out.println(maxStrength(new int[] {-4,-5,-4}));
	}
}

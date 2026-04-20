class PeakElement 
{
	static int peakElement(int[] nums){
		 if(nums.length==1)
            return 0;
        if(nums.length==2)
			return nums[0]>nums[1]?0:1;
		int out=0;
		for(int i=1;i<nums.length-1;i++){
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
				out=i;
		}
		if(out==0 && nums[nums.length-1]>nums[nums.length-2])
			out=nums.length-1;
		return out;
	}
	public static void main(String[] args) 
	{
		System.out.println(peakElement(new int[]{1,2,3,4}));
	}
}

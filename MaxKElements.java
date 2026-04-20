//Need to learn priority queue and max heap
class MaxKElements
{
	static long maxK(int[] nums,int k){
		long cost=0;
		int i,j;
		int max=0;
		for(i=0;i<k;i++){
			max=0;
			for(j=1;j<nums.length;j++){
				if(nums[j]>nums[max])
					max=j;
			}
			cost+=nums[max];
			nums[max]=(int)Math.ceil(nums[max]/3.0);
		}
		return cost;
	}
	public static void main(String[] args) 
	{
		int[] nums={1,10,3,3,3};
		int k=3;
		System.out.println(maxK(nums,k));
	}
}

class GoodArray 
{
	static boolean solution(int[] nums){
		int max=Integer.MIN_VALUE;
		int sum=0,count=0;
		for(int i=0;i<nums.length;i++){
			if(max<nums[i]){
				max=nums[i];
				count=1;
			}
			else if(max==nums[i])
				count++;
			sum+=nums[i];
		}
		if(max==nums.length-1 && count==2){
			if(plus(max)==(sum-max))
				return true;
		}
		return false;
	}
	static int plus(int n){
		int total=0;
		while(n>0){
			total+=n;
			n--;
		}
		return total;
	}
	public static void main(String[] args) 
	{
		System.out.println(solution(new int[] {1,3,4,4,2})?"good":"bad");
	}
}
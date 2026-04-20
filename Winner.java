class Winner 
{
	static boolean win(int[] nums){
		int p1=0,p2=0;
		int l=0,r=nums.length-1;
		boolean flag=false;
		while(l<=r){
			if(nums[l]>=nums[r]){
				if(flag)
					p1+=nums[l];
				else
					p2+=nums[l];
				l++;
			}
			else{
				if(flag)
					p1+=nums[r];
				else
					p2+=nums[r];
				r--;
			}
		}
		return p1>p2;
	}
	public static void main(String[] args) 
	{
		System.out.println(win(new int[] {1,5,233,7}));
	}
}

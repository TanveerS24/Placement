class PrimeSubOperation 
{
	static boolean prime(int n){
		if(n<=1)
            return false;
		if(n<=3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i+=6){
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}
	static boolean check(int[] nums,int k){
		for(int i=k+1;i<nums.length;i++){
			if(nums[i]<=nums[i-1])
				return false;
		}
		return true;
	}
	static boolean primeSubOperation(int[] nums){
		for(int i=0;i<nums.length;i++){
			int temp=nums[i]-1;
			while(!prime(temp) && temp>0){
				temp--;
			}
			if(temp>0 && nums[i]-temp>(i==0?):nums[i-1])){
				nums[i]-=temp;
			}
			if(i>0 && nums[i]<=nums[i-1]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(primeSubOperation(new int[] {4,9,6,10}));
	}
}

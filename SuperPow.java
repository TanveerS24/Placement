class Solution{
    private final int mod=1337;
    public int superPow(int a,int[] b){
        a%=mod;
        int ans=1;
        for(int i:b){
            ans=power(ans,10)*power(a,i)%mod;
        }
        return ans;
    }
    private int power(int a,int k){
        int res=1;
        for(int i=0;i<k;i++){
            res=(res*a)%mod;
        }
        return res;
    }
}
class SuperPow
{
	public static void main(String[] args) 
	{
		Solution s1=new Solution();
		int a=2000;
		int[] b={1,2,3};
		int res=s1.superPow(a,b);
		System.out.println(res);
	}
}
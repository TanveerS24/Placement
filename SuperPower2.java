/*
i/p:int a and int[] b
o/p:(a^b[0,n-1])%1337
formulas used:
	i.   (a^b)%mod=((a%mod)**(b%mod))%mod
	ii.  since b is an array to traverse the entire array 
	     ((a^10)*(a^b[i]))%mod
		 which is same as ((a)^(10+b[i]))%mod
*/
class SuperPower2 
{
	int mod=1337;     //instance variable to be used in the program
	int superPow(int a,int[] b){
        a%=mod;  //if the value of a is greater than mod, take the reminder
        int ans=1;
        for(int i=0;i<b.length;i++){
            ans=power(ans,10)*power(a,b[i])%mod;   //formula based approach
        }
        return ans;
    }
	int power(int a,int k){  //helper method to find to a^b[i] 
        int res=1;
        for(int i=0;i<k;i++){
            res=(res*a)%mod;  //if res goes beyond mod value then take then reminder
        }
        return res;
    }
	public static void main(String[] args) 
	{
		SuperPower2 s1=new SuperPower2();
		int a=2000;
		int[] b={1,2,3};
		int res=s1.superPow(a,b);
		System.out.println(res);
	}
}

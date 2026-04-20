class OnesAndZeroes  
{
	static int findMaxForm(String[] strs, int m, int n){
		int count=0;
		int i;
		StringBuilder sb=new StringBuilder();
		for(i=0;i<strs.length;i++){
			sb.append(strs[i]).append(" ");
		}
		System.out.println(sb.toString());
		int zero_c=0,one_c=0;
		for(i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '){
				if(zero_c<=m && one_c<=n)
					count++;
				zero_c=0;
				one_c=0;
			}
			else if(sb.charAt(i)=='1')
				one_c++;
			else
				zero_c++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(findMaxForm(new String[] {"10","0","1"},1,1));
	}
}
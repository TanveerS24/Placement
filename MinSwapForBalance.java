class MinSwapForBalance 
{
	static int solution(String s){
		if(s.length()==0)
			return 0;
		char[] arr=s.toCharArray();
		int left=0;
		int right=arr.length-1;
		int count=0;
		char temp;
		while(left<right){
			if(arr[left]!=']')
				left++;
			if(arr[right]!='[')
				right--;
			if(arr[left]==']' && arr[right]=='['){
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(solution("][]["));
	}
}

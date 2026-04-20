class LongestUniqueSubsequence 
{
	static int solution(String a,String b){
		int left=0;
		int right=a.length();
		int size1=-1;
		boolean flag=true;
		while(left<right){
			if(!b.contains(a.substring(left,right))){
				size1=(a.substring(left,right)).length();
				break;
			}
			else{
				if(flag)
					left++;
				else
					right--;
			}
		}
		left=0;
		right=b.length();
		int size2=-1;
		flag=true;
		while(left<right){
			if(!a.contains(b.substring(left,right))){
				size2=(b.substring(left,right)).length();
				break;
			}
			else{
				if(flag)
					left++;
				else
					right--;
			}
		}
		return size1>size2?size1:size2;
	}
	public static void main(String[] args) 
	{
		System.out.println(solution("aba","dvd"));
	}
}

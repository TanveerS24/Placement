class CircularSentence 
{
	static boolean circular(String s){
		char[] arr=s.toCharArray();
		int i=0;
		for(i=0;i<arr.length;i++){
			if(arr[i]==' '){
				if(arr[i-1]!=arr[i+1])
					return false
			}
		}
		if(arr[i-1]!=arr[0])
			return false;
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(circular("Leetcode experience esd delightful")?"yes":"NO");
	}
}

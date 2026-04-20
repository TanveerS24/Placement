import java.util.Arrays;
class  DuplicateNum
{
	static int findDuplicates(int[] nums){
		int arr[]=nums.clone();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++){
			if(arr[i]==arr[i+1]){
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		System.out.println(findDuplicates(new int[] {3,1,4,2,5,7,2}));
	}
}

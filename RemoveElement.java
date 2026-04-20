class RemoveElement 
{
	static int remove(int[] arr,int val){
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(val!=arr[i])
				k++;
		}
		return k;
	}
	public static void main(String[] args){
		int a[]={3,2,2,3};
		int val=3;
		System.out.println(remove(a,val));
	}
}

class LongestDuplicate{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,2,5,6,7,2,1};
        int size=arr.length;
        int i,j;
        int max_distance=Integer.MIN_VALUE,ele=-1;
        for(i=0;i<size;i++){
            for(j=size-1;j>=i;j--){
                if(arr[i]==arr[j]){
                    ele=(j-i)>max_distance?arr[i]:ele;
                    max_distance=(j-i)>max_distance?j-i:max_distance;
					break;
                }
            }
        }
		System.out.println(ele);
    }
}
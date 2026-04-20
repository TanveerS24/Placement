class  MaxWater
{
	 static int maxArea(int[] height){
		int n=height.length;
		int max=0,second_max=0;
		int volume=Integer.MIN_VALUE;
		int temp;
		for(int i=1;i<n;i++){
			if(height[i]>height[max]){
				second_max=max;
				max=i;
			}
			else if(height[i]>height[second_max]){
				second_max=i;
			}
			temp=height[second_max]*((Math.abs(max-second_max)+1));
			volume=volume>temp?volume:temp;
		}
		return volume;
	}
	public static void main(String[] args) 
	{
		int[] height={1,1};
		System.out.println(maxArea(height));
	}
}

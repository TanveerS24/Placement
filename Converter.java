class Converter
{
	public int[][] convert(int[] original,int m,int n){
		if((m*n)<original.length){
			return new int[][];
		}
		int[][] duplicate=new int[m][n];
		int[] temp=new int[n];
		int i=0;
		int j=0;
		while(i<original.length){
			System.arraycopy(original,i,temp,0,n);
			System.arraycopy(temp,0,duplicate,j,n);
			i+=n;
			j++;
		}
	}
	public static void main(String[] args) 
	{
		Converter cv=new Converter();
		int[][] x=cv.convert({1,2,3,4},2,2);
		for(i:x){
			for(j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

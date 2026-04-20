class Star 
{
	public static void main(String[] args) 
	{
		int rpoint=31;
		int lpoint=1;
		for(int i=1;i<=15;i++){
			for(int j=1;j<=32;j++){
				if(j==16 || (i>=3&&(j==lpoint || j==rpoint))){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			if(i>=3){
				lpoint+=3;
				rpoint-=3;
			}
			System.out.println();
		}
	}
}

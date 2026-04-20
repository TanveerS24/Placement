class Triangle 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if((j+i>=6 && j-i<=1) && ((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)))
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

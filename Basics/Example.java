class Example
{
	
	public static void main(String args[]){
		//while
		//do while
		//for
		//for each
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i==j || i+j==10){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
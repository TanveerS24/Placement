import static java.util.Scanner.nextInt();;
class NumPattern
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter no. of rows:");
		int n=Scanner.nextInt();
		int num;
		char ch='A';
		for(int i=1;i<=n;i++){
			num=i+1;
			for(int j=1;j<=n;j++){
				if(i==j){System.out.print(ch++ +" ");}
				else{
					System.out.print(num + " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}

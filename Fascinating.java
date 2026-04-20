class Fascinating
{
	static boolean isFascinating(int n){
		String num=n+""+n*2+n*3;
		System.out.println(num);
		if(num.length()>9)
			return false;
		boolean flag=true;
		int search=1,i;
		while(search<=9){
			if(!num.contains(search+""))
				return false;
			search++;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(isFascinating(192)?"True":"False");
	}
}

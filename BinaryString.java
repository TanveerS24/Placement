class BinaryString
{
	static String binaryString(String binary){
		int zero=0;
		int f_zero=-1;
		for(int i=0;i<binary.length();i++){
			if(binary.charAt(i)=='0'){
				zero++;
				if(f_zero==-1)
					f_zero=i;
			}
		}
		if(zero==0 || zero==1)
			return binary;
		char[] arr=new char[binary.length()];
		for(int i=0;i<arr.length;i++)
			arr[i]='1';
		arr[zero+f_zero-1]='0';
		return new String(arr);
	}
	public static void main(String[] args) 
	{
		System.out.println(binaryString("000110"));
	}
}

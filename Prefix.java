class Prefix 
{
	static int prefix(String sentence,String searchWord){
		String[] arr=sentence.split(" ");
		for(int i=0;i<arr.length;i++){
			if(arr[i].indexOf(searchWord)==0){
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		String sent="Hello world";
		String sea="el";
		System.out.println(prefix(sent,sea));
	}
}

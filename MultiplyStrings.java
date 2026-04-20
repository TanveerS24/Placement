class MultiplyStrings
{
	static String solution(String num1,String num2){
		int i,j=0;
		String small,big,temp,pro,out="";
		if(num1>num2){
			small=num2;
			big=num1;
		}
		else{
			small=num1;
			big=num2;
		}
		while(j<small.length()){
			temp=small.charAt[j]+"";
			for(i=0;i<big.length();i++){
				pro=(Integer.parseInt(temp)*Integer.parseInt(big.charAt(i)))+"";
				out=pro[0]
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(solution("123456789","987654321"));
	}
}

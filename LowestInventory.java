class LowestInventory
{
	/*static String lowestInventory(String s){
		String pro[]=s.split(";");
		int min=Integer.MAX_VALUE;
		String product="";
		for(int i=0;i<pro.length;i++){
			String[] temp=pro[i].split(" ");
			if(min>Integer.parseInt(temp[1])){
				product=temp[0];
				min=Integer.parseInt(temp[1]);
			}
		}
		return product;
	}*/
	static String lowestInventory(String s){
		String pro="",product="";
		int min=Integer.MAX_VALUE,point=0;
		String digits="";
		int i;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)==';'){
				if(!digits.equals("") && Integer.parseInt(digits)<min){
					min=Integer.parseInt(digits);
					pro=s.substring(point,i-1);
				}
				digits="";
				point=i;
			}
			else if(Character.isDigit(s.charAt(i)))
				digits+=s.charAt(i);
		}
		if(!digits.equals("") && Integer.parseInt(digits)<min){
					min=Integer.parseInt(digits);
					pro=s.substring(point,i-1);
		}
		i=pro.charAt(0)==';'?1:0;
		while(i<pro.length() && pro.charAt(i)!=' '){
			product+=pro.charAt(i);
			i++; 
		}
		return product;
	}
	public static void main(String[] args) 
	{
		String s="laptop 100;mobile 21;tv 123";
		System.out.println(lowestInventory(s));
	}
}

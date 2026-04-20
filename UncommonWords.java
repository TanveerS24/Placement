class UncommonWords 
{
	UncommonWords(String s1,String s2){
		String[] n1=s1.split(" ");
        String[] n2=s2.split(" ");
		String res=" ";
		for(int i=0;i<n1.length;i++){
			if(!(s2.contains(n1[i])))
				res+=n1[i]+" ";
		}
		for(int i=0;i<n2.length;i++){
			if(!(s1.contains(n2[i])))
				res+=n1[i]+" ";
		}
		n1=res.split(" ");
		for(int i=0;i<n1.length;i++){
			System.out.println(n1[i]);
		}
	}
}
class launch
{
	public static void main(String[] args) 
	{
		String s1="This apple is sweet";
		String s2="This apple is sour";
		UncommonWords n1=new UncommonWords(s1,s2);
		n1=null;
	}
}

import java.util.Arrays;
class  ArrangeLetters
{
	static String arrangeLetters(String s){
		String []str=s.split(" ");//convert to array of words
		for(int i=0;i<str.length;i++){//convert each string to array of charcter and sort them
			char []temp=str[i].toCharArray();
			Arrays.sort(temp);
			str[i]=new String(temp);
		}
		Arrays.sort(str);//sort every word with respect to character
		StringBuilder sb=new StringBuilder();//use String Builder to reduce its complexity
		for(int i=0;i<str.length;i++){
			sb.append(str[i]);
			if(i<str.length-1)//to avoid including space after the last word 
				sb.append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(arrangeLetters("hello world"));
	}
}
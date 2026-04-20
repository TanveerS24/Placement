public class New
{
	public static void main(String[] args){
		String a="Santhosh";
		System.out.println(a.substring(2,5));
		StringBuilder sb=new StringBuilder();
		sb.append("Naa");
		System.out.println(sb);
		a=new String(sb);
		int index=Integer.parseInt("67");
		System.out.println(index);
	}
}
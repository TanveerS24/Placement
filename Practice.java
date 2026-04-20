class launch
{
	public static void main(String[] args){
		Practice p1=new Practice();
		Practice p2=new Practice("mithun",20);
	}
}
class  Practice
{
	int num;
	String name;
	Practice(){
		num=10;
		name="Tanveer";
		System.out.println(name+" "+num);
	}
	Practice(String name,int num){
		this();
		this.num=num;
		this.name=name;
		System.out.println(name+" "+num);
	}
}

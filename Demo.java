class Demo
{
	public static void main(String[] args){
		Practice.setData();
		Practice.disp();
		System.out.println("creating an object....");
		Practice p1=new Practice();
		System.out.println("creating second object");
		Practice p2=new Practice("mithun",20);
		System.out.println((int)Math.pow(2,3));
	}
}
class  Practice
{
	static int num;
	static String name;
	static void setData(){
		num=40;
		name="jk";
	}
	static void disp(){
		System.out.println(name+" "+num+" this is static");
	}
	Practice(){
		//super();
		this("mama",30);
		num=10;
		name="Tanveer";
		System.out.println(name+" "+num+" this is unparameterized");
	}
	Practice(String name,int num){
		//super();
		//this();
		this.num=num;
		this.name=name;
		System.out.println(name+" "+num+" this was parameterized");
	}
}
interface Animals
{
	abstract public String animal="Animal";
	abstract public String breed="Breed";
	abstract public String color="Color";
	abstract public byte age=0;
	void setAnimal(String animal){
		this.animal=animal;
	}
	void setBreed(String breed){
		this.breed=breed;
	}
	void setColor(String color){
		this.color=color;
	}
	void age(byte age){
		this.age=age;
	}
	String getAnimal(){
		return animal;
	}
	String getBreed(){
		return breed;
	}
	String getColor(){
		return color;
	}
	byte getAge(){
		return age;
	}
}

class Toys
{
	String toy;
	Toys(String toy){
		this.toy=toy;
	}
}

abstract class Pets extends Toys implements Animals
{
	void play();
	void eat();
	void sleep();
}

class Dogs extends Pets
{
	Dogs(){
		setAnimal("Dog");
	}
	public void play(Toys t){
		System.out.println("The dog is playing with "+t.toy);	
	}
	public void eat(){
		System.out.println("The dog is eating");
	}
	public void sleep(){
		System.out.println("The dog is sleeping");
	}
}

class Oracle 
{
	public static void main(String[] args) 
	{
		Dogs d=new Dogs();
		Toys t=new Toys("rug");
	}
}

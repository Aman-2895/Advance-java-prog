class Animal{
	String name;                      //instance variable inside class but outside method 
	String sound;
	Animal(){
		this("cat2","meow2");              //when u not create constructor then class gives u default constructor 
	}
	Animal(String name, String sound){              // constructor overloading 
		                                               // overloading not judge by return type of method 
		this.name=name;
		this.sound=sound;	             //this keyword use for instance variable 
	}
	void getInfo() {
		System.out.println("Name = " +name);
		System.out.println("Sound = " +sound);	
	}
	void getInfo(String name,String sound, int legs) {
		System.out.println("Name = " +name);
		System.out.println("Sound = " +sound);
		System.out.println("legs = " +legs);	
	}
	String getinfo() {
		return name;
	}
}
class Cat extends Animal{       // all the member of super class are the member of child class (law of inheritance)
	Cat(String name, String sound){        //subclass constructor always find super class constructor call it implicitly
		super(name,sound);              // superclass constructor
	}
	void getInfo() {
		System.out.println("Name = " +name);
		System.out.println("Sound = " +sound);	 //overridding 
	}
	
}
public class PolyMain {                           //in overridding child class function call by child class object
                                                      //and super class function call by super class object only by using static method
	public static void main(String[] args) {         //this whole process called overhidden   
		// TODO Auto-generated method stub
		Animal a1 = new Animal("Horse", "Hing");
		a1.getInfo();
		a1.getInfo("cat","meow",4);
		Cat c1 = new Cat("cat2" , "mewo2");
		c1.getinfo();
	}

}

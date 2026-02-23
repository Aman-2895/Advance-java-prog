//interface is a template of a class before 1.8 version we only have abstract method n java but after 1.8 or 1.8 plus version we also have 
//default, static and private method

interface calc{
	void calculate(int n1,int n2);  // public final abstract 
	
	default void calculate(int n1, int n2, int n3) {          //default method define in interface 
		//System.out.println("Sum = "+(n1+n2+n3));       //we can create to many default method
		getPvtInfo("sum = "+(n1+n2+n3));                    //use private method to my personal use not for public
	}
	static String getinfo() {
		return "this is getinfo method inside the interface:";
	}
	private void getPvtInfo(String msg) {
		System.out.println(msg);                       //only use to personal use in interface 
	}
}

class calculator1 implements calc{
	public void calculate(int n1,int n2) {
		System.out.println("sum = "+ (n1+n2));
	}
	
	public void calculate(int n1, int n2, int n3) {          //default method define in interface 
		System.out.println("Sum of three number: "+(n1+n2+n3));       //we can create to many default method
	}
}

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		calculator1 c1 = new calculator1();
		c1.calculate(5, 6);
		c1.calculate(5, 6, 7);
		System.out.println(calc.getinfo());
		}
}

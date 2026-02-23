interface Area{
	double pi = 3.14;
	double getArea();
}

class Circle implements Area{
	
	double r;
	Circle(double r){
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return  pi*r*r;
	}
	public void displayArea() {
		System.out.println("Area of circle = "+getArea());	
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(14.5);
		System.out.println("Area of circle = "+ c1.getArea());
		c1.displayArea();
		
		Area c2 = new Circle(14.5);
		System.out.println("Area of circle = "+ c2.getArea());
	//	c2.displayArea();        cant do this child property cant use by parent
		
		Area r1 = new Area() {              // shortcut to override a function   

			@Override                                   // this looks like it is object of interface but its not
			public double getArea() {                //actually as sub class is created and thn it passes in interface
				// TODO Auto-generated method stub
				int l=10, b=40;
				return l*b;
			}};
			System.out.println("Area of rectangle = "+ r1.getArea());

	}

}

package abc;

public class MainYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day =2;
		String result = switch(day) {
		case 1 -> "monday";
		case 2 -> {
			System.out.println("this is case 2");
			yield "Tuesday";                       //yield keyword is a return of switch
		} 
		case 3,4,5,6->"come after tuesday";   //multiple case together
		default -> "no-day";
		};
		System.out.println(result);

	}

}


//@FunctionalInterface
//interface Square1{
//	int suare(int a);
//}
//public class SquareLamdaExp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Square1 s1 = a->a*a;
//        System.out.println("Square of a number: "+s1.suare(5));
//	}
//}
@FunctionalInterface
interface CheckPalindrome{
	void palin(String a);
}
public class SquareLamdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome p1 =(String a)->{
			String rev = new StringBuilder(a).reverse().toString();	
			if(a.equals(rev))
              System.out.println("yes");
			else
			  System.out.println("no");
		};
		p1.palin("nitin");
	}
}

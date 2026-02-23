class calculator2{
	calculator2(){
		System.out.println("this is contrutor");
	}

    int sub(int n1,int n2) {
        return n1-n2;
    }

    static int mul(int n1,int n2) {
        return n1*n2;
    }
}

@FunctionalInterface
interface calc1{
    int cal(int n1,int n2);
}

public class MethodRef {

    public static void main(String[] args) {

        calculator2 c = new calculator2();

        calc1 c1 = c::sub;
        System.out.println("Subtraction = "+c1.cal(100,25));

        calc1 c2 = calculator2::mul;
        System.out.println("Multiplication = "+c2.cal(100,25));

    }
}

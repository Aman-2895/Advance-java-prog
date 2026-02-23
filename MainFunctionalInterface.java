// Functional interface have one abstraction method with fucntionalInterface annotation
@FunctionalInterface
interface Add{                       // we can create default static private methods 
	int calculate(int a,int b);
                      		
}

public class MainFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add() {
			public int calculate(int a, int b) {
				return (a+b);
			}
		};
		System.out.println("Sum = "+a.calculate(5, 6));
		
		// we dont have to tell function name coz functional interface have only one method
		// it is short form of declaring anonymous function that reference pass to the functional interface object
		Add a1 = (int n1, int n2)->(n1+n2);       //lambda Expression
		System.out.println(a1.calculate(20, 30));
		
	//types of lambda expression 
		
	//	1. no parameter, no Return type:
	//     a. ()->{}	multiple lines in function   
	//	   b. ()->System.out.println("")      single line representation
		
	//	2. no parameter, with Return type:
	//	   a. ()->{
	//	         ....Write code.....
	//                return 10;	}
	//	   b. ()->10    return without return keyword
	//	
	//  3. with parameter, no Return type:
	//     a. (int num1)->{}
	//	      (num1)->System.out.println(num1);         if one parameter no need to mention data type
	//	      num1->System.out.println(num1);         also no need () for one data type
	//	   b. (int num1, int num2)->{}
	//	      (int num1, int num2)->System.out.println("");
		
	//	4. with parameter, with Return type:
	//	      (int num1, int num2)->num1+num2
    //	      (int num1, int num2)->{ return num1+num2 }
	}
}

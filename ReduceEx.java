package streamReduce;
import java.util.*;
import java.util.stream.IntStream;

public class ReduceEx {
	public static void main(String[]args) {
		List<Integer> list = Arrays.asList(34,12,45,76,34,54,32);
		int sum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum= "+sum);
		
		int avg  = list.stream().reduce(0,(a,b)->a+b)/list.size();
		System.out.println("avg= "+avg);
		
		System.out.println("----------practice-----------");
		
		int max = list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println("max= "+max);
		
		int min = list.stream().reduce(9999,(a,b)->a<b?a:b);
		System.out.println("min= "+min);
		
		int count = list.stream().reduce(0, (a,b)->a+1);
		System.out.println("count = "+count);
		
		int EvenSum = list.stream().reduce(0, (a,b)->a+(b%2==0?b:0));
		System.out.println("Even sum = "+EvenSum);
		
		List<String> str = Arrays.asList("Java","Stream","API","Reduce");
		String concat = str.stream().reduce("",(a, b)->a+b);
		System.out.println("Final string is = "+concat);
		
		int Second = list.stream().reduce(0,(a,b)->a>b&&a<max?a:b);
		System.out.println("Second max= "+Second);
		
		int Smin = list.stream().reduce(0,(a,b)->a<b&&a>min?a:b);
		System.out.println("Second min= "+Smin);
		
		List<String> str2 = Arrays.asList("Java","Stream","API","Reduce");
        String greatest = str.stream().reduce("",(a, b)->a.length()>b.length()?a:b);
		System.out.println("Largest string is = "+greatest);
		
//		int digitSum = list.stream().reduce(0,(a,b)->a+getsum(b));
				
//		int getsum(int num) {
//		    int digit = b;
//		    int s = 0;
//		    while (digit != 0) {
//		        int rem = digit % 10; // extract last digit
//		        s = s + rem;          // add to sum
//		        digit = digit / 10;   // remove last digit
//		    }
//		    return s;
//		}
		
//		System.out.println("Digit Sum= "+digitSum);
		
		
		//List<Integer> list2 = Arrays.asList(); 
		int num = 123456;

      //  String str1 = num.toSting();    
//		String str1 = String.valueOf(num);
//        String[] arr = str1.split("");         
//
//        List<String> newList = Arrays.asList(arr);
		int rel = String.valueOf(num).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
		System.out.println(rel);
		
		int n=5;
//		int []arr = new int[5];
//		for(int i=1;i<=5;i++) {
//			arr[i]=i;
//		}
//		List<int[]> newlist = Arrays.asList(arr);
//		int fact = newlist.stream().reduce(1,(a,b)->a*b);
//		System.out.println("factorial= "+fact);
		
	//	int fact1 = newlist.stream().
		
		int fact = IntStream.rangeClosed(1, n).reduce(1, (a,b)->a*b);
		System.out.println("factorial = "+fact);
        
	}

}

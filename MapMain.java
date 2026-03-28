package advance;
import java.util.*;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(23,32,45,35,67,89,95);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(numbers);
		System.out.println(list);
		List<Integer> result = list.stream().map(n->n+5).toList();
		System.out.println(result);
		
		List<String> l1 = Arrays.asList("sachin","rahul","amit");
		List<String> result1 = l1.stream().map(n->n.toUpperCase()).toList();
		System.out.println(result1);
		
		List<Integer> l2 = Arrays.asList(1,2,3,4);
		List<Integer> result2 = l2.stream().map(n->n*n).toList();
		System.out.println(result2);
		
		List<String> l3 = Arrays.asList("Java","python","c");
		List<Character> result3 = l3.stream().map(n->n.charAt(0)).toList();
		System.out.println(result3);
		
		List<String> l4 = Arrays.asList("A","B","C");
		List<String> result4 = l4.stream().map(n->"Item- "+n).toList();
		System.out.println(result4);
		
		List<Double> l5 = Arrays.asList(0.0,20.0,30.0);
		List<Double> result5 = l5.stream().map(n->(n*1.8)+32).toList();
		System.out.println(result5);
		
		
		
		
		
		
		
		

	}

}

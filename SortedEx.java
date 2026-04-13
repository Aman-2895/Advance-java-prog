package Sorted;
import java.util.*;
public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(23,12,1,45,23,76,26,91);
		List<Integer> sortedList = list.stream().sorted().toList();
		System.out.println(sortedList);
		
		List<Integer> sortedList1 = list.stream().sorted((a,b)->a-b).toList();
		System.out.println(sortedList1);

		List<Integer> sortedList2 = list.stream().sorted((a,b)->b-a).toList(); 
		//if it return positive value it swap a, b
		//if negative or zero return - no swapping  
		System.out.println(sortedList2);
		
		//comparable - interface - compare to  
		// implement and use same class
		
		//comparator - interface - compare
		// implement and use in different class
		System.out.println("---------------*------------");
		System.out.println(sortedList1.subList(list.size()-3, list.size()));
		
		List<Integer> sortedList3 = list.stream().filter((n)->n%2==0).sorted((a,b)->a-b).toList(); 
		System.out.println(sortedList3);
		
		List<Integer> sortedList4 = list.stream().distinct().sorted((a,b)->a-b).toList(); 
		System.out.println(sortedList4);
		
	    Integer sortedList5 = list.stream().sorted((a,b)->b-a).toList().get(1); 
		System.out.println(sortedList5);
		
		List<Integer> sortedList6 = list.stream().filter((n)->n>20).sorted((a,b)->a-b).toList(); 
		System.out.println(sortedList6);
		
		List<String> str =Arrays.asList("Ravi","Ankit","Zoya","Meena","Kumal");
		List<String> sortedList7 = str.stream().sorted().toList(); 
		System.out.println(sortedList7);
		
		List<String> sortedList8 = str.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(sortedList8);
		
		List<String> sortedList9 = str.stream().sorted((a,b)->a.length()-b.length()).toList();
		System.out.println(sortedList9);
		

		
		
		
	}

}

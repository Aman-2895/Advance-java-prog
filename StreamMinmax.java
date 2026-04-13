package streamReduce;
import java.util.*;
public class StreamMinmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12,1,4,100,200,150,45,67,99);
		
		Optional<Integer> result = list.stream().min((a,b)->a-b);
		result.ifPresent(System.out::println);
		
		Optional<Integer> result1 = list.stream().max((a,b)->a-b);
		result1.ifPresent(System.out::println);
		
		System.out.println("-----------------------*******-------------------");
		
		List<Integer> data = Arrays.asList(10,20,5,20,40,15);
		Optional<Integer> result2 = list.stream().min((a,b)->a-b);
		result2.ifPresent(System.out::println);
		
		List<Integer> result3 = data.stream().distinct().toList();
		System.out.println(result3);
		
		Optional<Integer> result4 = data.stream().sorted().skip(1).findFirst();
		System.out.println(result4);
		
		Optional<Integer> result5 = data.stream().sorted((a,b)->b-a).skip(1).findFirst();
		System.out.println(result5);
		
		List<Integer> result6 = data.stream().distinct().sorted((a,b)->b-a).limit(3).toList();
		System.out.println(result6);
		
		List<Integer> result7 = data.stream().distinct().sorted((a,b)->a-b).limit(3).toList();
		System.out.println(result7);
		
		//both limit and skip
		List<Integer> result8 = data.stream().distinct().sorted((a,b)->a-b).skip(2).limit(3).toList();
		System.out.println(result8);
		
		List<String> str = Arrays.asList("Ram","Shyam","Amit","Zoya","Ravi");
		Optional<String> result9 = str.stream().min((a,b)->a.compareTo(b));
		//System.out.println(result9);
		result9.ifPresent(System.out::println);
		

		
		
		
		
		
		
		
		
		

	}

}

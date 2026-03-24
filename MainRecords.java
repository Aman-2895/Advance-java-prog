package abc;
import java.util.*;
//import java.util.function.Consumer;
import java.util.Arrays;

// variable are final and pvt 
// we only have getter not setter 
// because record class is immutable 
record Student(int sid, String name,String course) {
};
public class MainRecords{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student(1,"Studdent 1","mca");
//		System.out.println(s.sid());
//		System.out.println(s.name());
//		System.out.println(s.course());
//		System.out.println(s);
		
		//for each method
		int data[]= new int [] {23,34,45};   //array cant access any for each method
		//List<Integer> arrlist = new ArrayList<>(Arrays.asList(data));
		//List<Integer> listdata = Arrays.stream(data).boxed().collect(collectors.toList());
		
		List<Integer> listdata = Arrays.stream(data).boxed().toList();
		System.out.println(listdata);
		listdata.forEach((value)->System.out.println(value));
	//forEach is a method forEach() we pass whole function interface expression in parameter 
	//and this method does not have any return type....
		listdata.forEach(System.out::println);  //not pass lambda expression|| pass method refrencing 
			
	}
}

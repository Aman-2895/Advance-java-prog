// sequence of operation in a pipeline 
// terminating operation - give output
// intermediate operation - output of one operation is input of other input
// applied on collections not on array
package abc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Consumer;


public class FilterAPI {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(24,56,23,45,67);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,56,78,23,45,67,85,95,112));
		list.addAll(data);
		System.out.println(list);
		
		//Stream listStream = list.stream();    can not two operation only one 
		
		// no need to create object use only "list.stream();" every time creates new stream
		
		//list.stream().filter((n)->n>60);     just created now we have two ways to print 
		
		list.stream().filter((n)->n>60).forEach((n)->System.out.println(n));
		List<Integer> g60 = list.stream().filter((n)->n>60).toList();
		System.out.println();
		System.out.println(g60);
		
		List<Integer> g60l90 = list.stream().filter((n)->n>60 && n<90).toList();
		System.out.println();
		System.out.println(g60l90);
		
		// practice
		System.out.println(".....................practice............. ");
		
		List<Integer> data1 = Arrays.asList(10,15,20,25,30,11,17,16);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(data1);
		list1.stream().filter((n)->n%2==0).forEach((n)->System.out.print(n+" "));

		List<String> data2 = Arrays.asList("Amit","Ravi","Anil","vikas","Ashok","Rahul");
		List<String> stA = data2.stream().filter((n)->n.charAt(0)=='A').toList();
		System.out.println();
		System.out.println(stA);
		
		List<Integer>data3 = Arrays.asList(10,60,45,90,30,24,50,76);
		ArrayList<Integer>list3  = new ArrayList<Integer>();
		list3.addAll(data3);
		list3.stream().filter((n)->n>=50 && n<=60).forEach((n)->System.out.print(n+" "));
		//list3.stream().distinct().filter((n)->n>=50 && n<=60).forEach((n)->System.out.print(n+" "));
        // for unique data
		
		List<String> data4 = Arrays.asList("Java","Python","C","React","C#","Next.js","Node.js");
		List<String> list4 = data4.stream().filter((n)->n.length()>4).toList();
		System.out.println();
		System.out.println(list4);
		
		List<String> data5 = Arrays.asList("Java",null,"Spring",null,"React");
		ArrayList<String> newList = new ArrayList<String>();
		newList.addAll(data5);
		List<String> result = newList.stream().filter((n)->n!=null).toList();
		System.out.println();
		System.out.println(result);
		
		
		
		

		


		
	}

}

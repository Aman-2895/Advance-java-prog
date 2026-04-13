package Sorted;

import java.util.*;

class Employee{
	String dept;
	int salary;
	Employee(int salary, String dept){
		this.dept=dept;
		this.salary = salary;	
	}
	
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class Sortedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(2000,"IT"));
		list.add(new Employee(1800,"CS"));
		list.add(new Employee(2200,"ML"));
		list.add(new Employee(1200,"HR"));
		
		List<Employee> sortedList = list.stream().sorted((a,b)->a.getSalary()-b.getSalary()).toList();
		System.out.println(sortedList);
		
		sortedList.forEach(System.out::println);
		
	}

}

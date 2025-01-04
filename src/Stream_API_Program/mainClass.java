package Stream_API_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class mainClass {

	public static void main(String[] args) {


		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "tushar", "tmakude@gmail.com"));
		list.add(new Employee(4, "satyam", "satyam@gmail.com"));
		list.add(new Employee(6, "vikas", "vikashiwale@gmail.com"));
		list.add(new Employee(2, "himanshu", "trivedi@gmail.com"));
		list.add(new Employee(5, "gaurav", "chaudhari@gmail.com"));
		
	
		
		List<Employee> list2=list.stream().sorted((o1, o2) -> o1.getEmail().compareTo(o2.getEmail())).collect(Collectors.toList()); 


		list2.forEach(System.out :: println);
		
		List<Integer> newList = Arrays.asList(10,15,15,30,45,60);
		
		newList.stream().filter(c -> c%2==0).forEach(System.out::println);
		
		List<String> string = Arrays.asList("Java", "C++" , "python");
		
		string.stream().map(str -> str + " : "+ str.length()).forEach(System.out::println);


		List<Integer> numberList = Arrays.asList(2,3,4);
		numberList.stream().map( num -> num*3).forEach(System.out::println);

	}

}

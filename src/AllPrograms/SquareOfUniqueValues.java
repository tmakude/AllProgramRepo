package AllPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfUniqueValues {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1,1,2,3,4,4,5);
		  
		List<Integer> list2 =list.stream().filter(x-> x==2 || x==3 || x==5).map(x-> x*x).collect(Collectors.toList());

		System.out.println(list2);
		    

	}

}

package Stream_API_Program;

import java.util.Comparator;
import java.util.stream.Collector;

public class SortingBasedOnId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getId() - o2.getId();
	}

}

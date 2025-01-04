package Stream_API_Program;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargest_Length_String {

	public static void main(String[] args) {


		String str = "I am learning the Stream API in java";
		
		String string =Arrays.stream(str.split(" ")).max(Comparator.comparing(String :: length)).get();
		
		System.out.println(string);

	}

}

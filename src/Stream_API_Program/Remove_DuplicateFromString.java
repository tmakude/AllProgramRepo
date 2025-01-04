package Stream_API_Program;

import java.util.Arrays;

public class Remove_DuplicateFromString {

	public static void main(String[] args) {


		String str = "dabcadefg";
		
		Arrays.stream(str.split("")).distinct().forEach(System.out :: print);

	}

}

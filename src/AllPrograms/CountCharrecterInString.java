package AllPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharrecterInString {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		countDiplicates(str);

	}

	private static void countDiplicates(String str) {
		
		String newString = "";
		
		Map<Character , Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			
			map.put( c , map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character , Integer> entry : map.entrySet()) {
			
			newString += entry.getKey()+""+entry.getValue();
		}
		
		System.out.println(newString);


		
	}

}

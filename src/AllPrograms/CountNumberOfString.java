package AllPrograms;

import java.util.Stack;

public class CountNumberOfString {

	public static void main(String[] args) {
		
		String str = "abbaca";
		
		//output should be :: ca
		
		removeSubSequence(str);

	}

	private static void removeSubSequence(String str) {
		
		Stack<Character>  result = new Stack<>();
		
		for(char c : str.toCharArray()) {
			
			if(!result.isEmpty() && result.peek() == c) {
				
				result.pop();
			}else {
				
				result.push(c);
			}
		}
		
		System.out.println( "The Result is "+ result.toString());
		

		
	}
	
	

}

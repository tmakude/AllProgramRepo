package AllPrograms;

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings {

	public static void main(String[] args) {


//		Input: s = "ABFCACDB"
//	    Output: 2
		
		String str = "ABFCACDB";
		System.out.println(" String length is "+minLength(str));

	}

	private static int minLength(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(char c : str.toCharArray()) {
		
		if(!st.isEmpty() &&((st.peek() == 'A' && c == 'B')|| (st.peek() == 'C' && c == 'D') ))
		{
			st.pop();
		}else {
			st.push(c);
		}}
	
		
		return st.size();


		
		
	}

}

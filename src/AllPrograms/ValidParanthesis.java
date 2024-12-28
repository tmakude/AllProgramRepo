package AllPrograms;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
//		Example 1:
//
//			Input: s = "()"
//
//			Output: true
//
//			Example 2:
//
//			Input: s = "()[]{}"
//
//			Output: true
//
//			Example 3:
//
//			Input: s = "(]"
//
//			Output: false
//
//			Example 4:
//
//			Input: s = "([])"
//
//			Output: true

		String str = "()[]{}";
		
		System.out.println(isValidParantheis(str));

	}

	private static boolean isValidParantheis(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(char c : str.toCharArray()) {
			
			if(c == '(' || c == '[' || c == '{') {
				
				st.push(c);
			}else {
				
				if(st.isEmpty()) {
					
					return false;
				}
				
				char pop = st.pop();
				
				if((c == ')' && pop != '(') || (c == ']' && pop != '[') || (c == '}' && pop != '{') ) {
					
					return false;
				}
			}
			
		}
		
		return st.isEmpty();
	}

}

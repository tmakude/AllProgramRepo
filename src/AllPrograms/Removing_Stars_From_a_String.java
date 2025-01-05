package AllPrograms;

import java.util.Stack;

public class Removing_Stars_From_a_String {

	public static void main(String[] args) {
//		Input: s = "leet**cod*e"
//				Output: "lecoe"

		String str = "leet**cod*e";
		System.out.println(removeStars(str));

	}

	private static String removeStars(String str) {

		Stack<Character> st = new Stack<>();

		for (char c : str.toCharArray()) {

			if (c == '*') {
				st.pop();
			} else {

				st.push(c);
			}
		}

		String strr = "";

		for (char ch : st) {

			strr += ch;

		}
		return strr;

	}

}

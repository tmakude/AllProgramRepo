package AllPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "TusharMakude";

		// Output should be : rahsuTedukaM;
		reverseStrng(str);

	}

	private static void reverseStrng(String str) {

		String str1 = new StringBuffer().append(str.substring(0, str.length() / 2)).reverse().toString();
		String str2 = new StringBuffer().append(str.substring(str.length() / 2)).reverse().toString();
		String result = str1 + str2;

		System.out.println(result);
		
		

	}

	

}

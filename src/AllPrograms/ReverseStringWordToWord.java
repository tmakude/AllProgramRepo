package AllPrograms;

public class ReverseStringWordToWord {

	public static void main(String[] args) {

		String str = "My name is Tushar";

		String[] stringArr = str.split(" ");

		for (String str1 : stringArr) {

			reverseString(str1);
		}

		// Output should be 'yM eman si rahsuT'

	}

	private static void reverseString(String str1) {

//		StringBuffer sb = new StringBuffer();
//		
//		System.out.print(sb.append(str1).reverse().toString()+ " ");

		char[] charArray = str1.toCharArray();
		int left = 0;
		int right = str1.length() - 1;

		while (left < right) {

			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		String reversedString = new String(charArray);
		System.out.print(reversedString + " ");

	}

}

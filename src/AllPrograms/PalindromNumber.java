package AllPrograms;

public class PalindromNumber {

	public static void main(String[] args) {

		int number = 121;

		if (isPalindrom(number)) {
			System.out.println("The Number is Palindrom");
		} else {
			System.out.println("The Number is Not Palindrom");
		}

	}

	private static boolean isPalindrom(int number) {

//		if (number < 0) {
//			return false;
//		}
//
//		String str = Integer.toString(number);
//		int left = 0;
//		int rigth = str.length() - 1;
//
//		while (left <= rigth) {
//
//			if (str.charAt(left) != str.charAt(rigth)) {
//				return false;
//			}
//			left++;
//			rigth--;
//		}
//
//		return true;
		
		//Another Method
		
		int temp = number;
		int sum = 0;
		while(temp > 0) {
			int remember = temp % 10;
			sum = sum *10 +remember;
			temp /= 10;
		}
		
		if(sum == number) {
			return true;
		}else
		{
			return false;
		}

	}

}

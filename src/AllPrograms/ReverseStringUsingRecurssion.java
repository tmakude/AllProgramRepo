package AllPrograms;

public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		System.out.println("The Original String is :"+str);
		System.out.print("The Reverse String is : ");
		
		System.out.println(reverse(str));


		

	}

	private static String reverse(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1))+ str.charAt(0);




	}

}

package AllPrograms;

public class Reverse_String {

	public static void main(String[] args) {


        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(java.util.Arrays.toString(s1)); 


        // Example 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
       reverseString(s2);
        System.out.println(java.util.Arrays.toString(s2));

	}
	
	public static void reverseString(char[] s) {
		
		  int left = 0;
	        int right = s.length - 1;

	        while (left < right) {
	            
	            char temp = s[left];
	            s[left] = s[right];
	            s[right] = temp;

	            
	            left++;
	            right--;
	        }
	}

}

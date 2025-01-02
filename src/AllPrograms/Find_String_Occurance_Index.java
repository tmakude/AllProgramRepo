package AllPrograms;

public class Find_String_Occurance_Index {

	public static void main(String[] args) {
//		Example 1:
//
//			Input: haystack = "sadbutsad", needle = "sad"
//			Output: 0
//			Explanation: "sad" occurs at index 0 and 6.
//			The first occurrence is at index 0, so we return 0.
//			Example 2:
//
//			Input: haystack = "leetcode", needle = "leeto"
//			Output: -1
//			Explanation: "leeto" did not occur in "leetcode", so we return -1.
		
		String str1 ="leetcode";
		String str2 =  "leeto";
		
		System.out.println("Find The Index : "+ subString(str1 , str2));

	}

	private static int subString(String str1, String str2) {
		//First Solution
//		return str1.indexOf(str2);
		
		//Second Solution
//		int m = str1.length();
//		int n = str2.length();
//		for(int i =0 ; i < m-n ; i++) {
//			
//			if(str1.substring(i, n+i).equals(str2)) {
//				return i;
//			}
//			
//		}
//		return -1;
		
		// Third Solution 
		
		String str = str1.replaceFirst(str2, " ");
		
		for(int i =0 ; i < str.length() ; i++) {
			
			if(str.charAt(i) == ' ') {
				return i;
			}
		}
		
	
		
		return -1;
		
	}

}

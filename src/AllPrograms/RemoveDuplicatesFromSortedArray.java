package AllPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
//		Input: nums = [1,1,2]
//		Output: 2, nums = [1,2,_]
		
		int[] arr = {1,1,2};
		System.out.println("The Count is :" + removeDuplicatesFromSortedArray(arr));
		

	}

	private static int removeDuplicatesFromSortedArray(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : arr) {
			
			set.add(i);
		}
		
		int k=0;
		
		for(int unique : set) {
			
			arr[k++] = unique;
		}
		return k;


		
		
	}

}

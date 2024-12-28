package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		
//		Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		int arr[] = {2,7,11,15};
		int target = 9;
		
		System.out.println(twoSum(arr , target));

	}
	
    public static int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> ht = new HashMap<>();
        for (int i =0;i< nums.length;i++) {
            int tmp = nums[i];
            if (ht.containsKey(target - tmp)) {
                return new int[] {ht.get(target - tmp),i};
            }
            ht.put(tmp,i);

        }
        return new int[0];
    }

}

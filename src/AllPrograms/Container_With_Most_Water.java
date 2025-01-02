package AllPrograms;

public class Container_With_Most_Water {

	public static void main(String[] args) {


		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water is : "+maxArea(height));

	}

	private static int  maxArea(int[] height) {
		
        int left = 0;
        int right =height.length-1;
        int maxArea=0;
        while(left < right){

            int currentArea = (right - left) * Math.min(height[left] , height[right]);

            maxArea = Math.max(maxArea,currentArea);

            if(height[left] < height[right]){

                left++;
            }else{
                right--;
            }

        }

        return maxArea;
	}

}

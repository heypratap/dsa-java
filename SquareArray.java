import java.util.Arrays;

/**
 * SquareArray
 */
public class SquareArray {

    static int[] squaredArray(int[] nums){
        int[] result = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int idx = nums.length-1;
        while(left<= right){
            int leftSquare = nums[left] * nums[left]; 
            int rightSquare = nums[right] * nums[right];
            if(leftSquare> rightSquare){
                result[idx] = leftSquare;
                left++;
            }
            else{
                result[idx] = rightSquare;
                right--;
            }
            idx--;
        }
        return result;
    }
     public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = squaredArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
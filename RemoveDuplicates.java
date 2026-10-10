import java.util.Arrays;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for(int i=1; i<n;i++){
            if(nums[i] != nums[idx]){
                idx++;
                nums[idx] = nums[i];
            }

        }
        return idx+1;

}
public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3};

    int k = removeDuplicates(nums);

    System.out.println("Unique count: " + k);
    System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
}}

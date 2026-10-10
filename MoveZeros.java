import java.util.Arrays;

public class MoveZeros {

    static void moveZeros(int [] nums ){

        int n = nums.length;
        int zero =0;
        
            for(int i =0; i<n; i++){
                if(nums[i] != 0){
                    nums[zero] = nums[i];
                    zero++;
                }
            }
           for(int i = zero;  i < n; i++){
                nums[i] =0;
           }
    }
    public static void main(String[] args) {
         int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        System.out.println(Arrays.toString(nums));
    }
}

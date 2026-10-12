//Print an Array in Reverse Order


public class ReverseArray {
    static void  printReverse(int[] nums) {

    int right = nums.length-1;
    while(right>=0){
        System.out.println(nums[right] + " ");
        right--;
    }
}
public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50};
     printReverse(nums);
    
}
}

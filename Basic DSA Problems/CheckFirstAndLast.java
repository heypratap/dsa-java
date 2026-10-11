
//Check if the First and Last Elements Are Equal

public class CheckFirstAndLast {
    static boolean checkFirstAndLast(int[] nums) {
    int left = 0;
    int right = nums.length-1;
    return  nums[left] == nums[right];

}
public static void main(String[] args) {
int[] nums = {1, 2, 3, 3};
int[] nums2 = {1,2,3,4,1};
System.out.println(checkFirstAndLast(nums));
System.out.println(checkFirstAndLast(nums2));
}
}

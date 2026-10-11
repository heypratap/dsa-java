//Compare the First and Last Elements
/*Given an array, print its first and last elements. */

import java.util.Arrays;

public class CompareElement {

    static int[] compareElement(int[] nums){
        int left = 0;
        int right = nums.length-1;
         return new int[] { nums[left], nums[right] };
       
    }
    
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
       int [] result =  compareElement(nums);
       System.out.println(Arrays.toString(result)
       );


    }
}

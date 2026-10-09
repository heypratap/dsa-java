import java.util.Arrays;
/**
 * ReverseArray
 */
class ReverseArray {
    static void reverseArray(int[] arr) {
    
        int left = 0;
        int right = arr.length - 1;;
        while(left<right){
            int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        }
      
    }

    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5,6};
        reverseArray(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}

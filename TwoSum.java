class TwoSum{
    static boolean twoSum(int[] arr, int target) {
    int left = 0;
    int right = arr.length-1;

    while(left < right){
        int sum = arr[left] + arr[right];
        if(sum == target) return true;
        if(sum < target) left++;
        else right--;
    }
    return false;

}
  public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 2, 3, 4, 6}, 6));  // true
        System.out.println(twoSum(new int[]{1, 2, 4, 5, 7}, 20)); // false
        System.out.println(twoSum(new int[]{2, 3, 5, 8, 9}, 10)); // true
    }
}
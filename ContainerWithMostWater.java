public class ContainerWithMostWater {
    static int containerWithMostWater(int [] heights){
        int left=0;
        int right = heights.length-1;
        int maxArea = 0;
        while (left<right) {
            int area = (right-left)*Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea,area);
            if(left<right){
                left++;
            }
            else right--;
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(containerWithMostWater(heights));
    }
}
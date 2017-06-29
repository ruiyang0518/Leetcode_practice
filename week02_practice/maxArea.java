package week02;

/**
 * Created by 502750454 on 6/29/2017.
 */
public class maxArea {
    public static void main(String[] args) {
        int[] nums = new int[]{5,10,1,2,10};
        System.out.println(maxArea(nums));

    }
    public static int maxArea(int[] nums){
        // corner case
        if(nums== null || nums.length ==0){
            return 0;
        }

        int start = 0;
        int end = nums.length-1;
        int maxArea = 0;

        while(start<end){
            if(nums[start]<nums[end]){
                maxArea = Math.max(maxArea,(end-start)*nums[start]);
                start++;
            }else{
                maxArea = Math.max(maxArea,(end-start)*nums[end]);
                end--;
            }

        }
        return maxArea;
    }
}

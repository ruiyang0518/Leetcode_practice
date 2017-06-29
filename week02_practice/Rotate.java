package week02;

/**
 * Created by 502750454 on 6/28/2017.
 */
public class Rotate {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        rotate(nums,9);
    }
    public static void rotate(int[]nums,int k){
       if(nums == null || nums.length == 0){
           return;
       }

       k = k % nums.length;
       helper(nums,0,nums.length-1);
       helper(nums,0,k-1);
       helper(nums,k,nums.length-1);

       for(int i:nums){
           System.out.println("i is : " + i);
       }

    }

    public static void helper(int nums[], int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }

}


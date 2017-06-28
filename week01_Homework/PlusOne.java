package hw.week01;

/**
 * Created by 502750454 on 6/22/2017.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{2,8,9,9,9};
        plusOne(nums);
    }

    public static int[] plusOne(int[] nums){
        // corner case
        if(nums==null || nums.length ==0){
            return nums;
        }

        // add one to the end of array
        int end = nums.length-1;
        int add = nums[end]+1;
        int carry = add/10;
        nums[end] = add%10;
        int index = end-1;

        // if carry is not zeor
        // keep add carry to up digit
        while (carry!=0) {
            int forward = nums[index] + carry;
            carry = forward / 10;
            nums[index] = forward % 10;
            index--;
        }

        return nums;
    }


}

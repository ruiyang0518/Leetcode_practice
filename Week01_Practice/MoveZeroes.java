/**
 * Created by 502750454 on 6/15/2017.
 */
public class MoveZeroes {

    public static int[] moveZeroes(int[]nums){

        // corner case
        if (nums==null || nums.length ==0){
            return null;
        }

        // every non-zero element move to the front
        int startIndex = 0;
        for( int i = 0; i < nums.length ; i++){
            if(nums[i] != 0){
                swap (nums,i,startIndex);
                startIndex ++;
            }
        }
        return nums;
    }
    public static void swap(int[]nums, int moveIndex, int endIndex){
        int temp = nums[moveIndex];
        nums[moveIndex] = nums[endIndex];
        nums[endIndex] = temp;
    }
}

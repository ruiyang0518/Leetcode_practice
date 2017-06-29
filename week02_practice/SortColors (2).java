package week02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 502750454 on 6/15/2017.
 */
public class SortColors {
    public static void main(String[] args) {
        SortColors ss = new SortColors();
        int[] nums = {0,1,2,0,0,2,3,3,4,9,6,6,6,6};
        ss.followup(nums);
    }
    public void sortColors(int[] nums){
        if (nums == null || nums.length ==0){
            return;
        }

        int zeroIndex = 0;
        int twoIndex = nums.length - 1;

        // have to include = , otherwise the last element will be ingored
        for(int i = 0; i <= twoIndex; i++){
            if( nums[i]==0){
                swap(nums,zeroIndex,i);
                zeroIndex++;
            }else if (nums[i]==2){
                swap(nums,twoIndex,i);
                twoIndex--;
                // remeber to minus i, otherwise the reversed element will be ingored
                i--;
            }
        }
    }

    public static void swap(int[]nums, int moveIndex, int endIndex){
        int temp = nums[moveIndex];
        nums[moveIndex] = nums[endIndex];
        nums[endIndex] = temp;
    }

    // if there is more nums have to be sorted( >3), two pointer is not enough
    public static void followup(int[] nums){
        // base case
        if(nums ==null || nums.length == 0 ){
            return;
        }

        Map <Integer,Integer> map = new HashMap<Integer,Integer>();
        for( int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int i = 0;
        for(int s:map.keySet()){
            int endIndex = map.get(s);
            while(endIndex != 0){
                nums[i] = s;
                i++;
                endIndex--;
            }
        }
    }
}

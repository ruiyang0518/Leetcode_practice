/**
 * Created by 502750454 on 6/14/2017.
 */
public class RemoveElements {
    public int removeElement(int[]nums,int val){
        //corner case
        if(nums == null || nums.length == 0){
            return 0;
        }

        int endIndex = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] ==val){
                swap(nums,i,endIndex);
                endIndex--;
            }
        }
        return endIndex-1;
    }

    public static int[] swap(int[]nums,int indexOne, int indexTwo){
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
        return nums;
    }
}

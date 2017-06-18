/**
 * Created by 502750454 on 6/14/2017.
 */
public class RemoveElements {
    public static void main(String[] args) {
        RemoveElements re = new RemoveElements();
        int[] nums = new int[]{1, 2, 3, 4, 3, 1, 3};

       System.out.print( "\n"+re.removeElement(nums,3));
    }
    public int removeElement(int[]nums,int val){
        //corner case
        if(nums == null || nums.length == 0){
            return 0;
        }

        // also can put all the non-val numbers to the front and use startindex to point to the
        // numbers that are equals to val, each non-val numbers will swap with the val-numbers
        int endIndex = nums.length-1;
        for(int i = endIndex;i>=0;i--){
            if (nums[i] == val){
                swap(nums,i,endIndex);
                endIndex--;
            }
        }

        return endIndex+1;
    }

    public static void swap(int[]nums,int indexOne, int indexTwo){
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }
}

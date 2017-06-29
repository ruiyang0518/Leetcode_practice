package hw.week02;

import java.lang.reflect.Array;

/**
 * Created by 502750454 on 6/22/2017.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = new int[6];
        num1[0] = 9;
        num1[1] = 0;
        num1[2] = 0;
        num1[3] = 0;

        int[] num2 = new int[] {1,5,10};
        mergeSortedArray(num1,1,num2,num2.length);
    }
    public static void mergeSortedArray(int[]num1,int m,int[]num2,int n){

       int endOne = m-1;
       int endTwo = n-1;
       int index = m+n-1;

       while(endOne>=0 && endTwo >=0){
           System.out.print("curent num1:"+num1[endOne]+"\n");
           System.out.print("curent num2:"+num2[endTwo]+"\n");
           if(num1[endOne] > num2[endTwo]){
               num1[index] = num1[endOne];
               endOne--;
           } else {
               num1[index] = num2[endTwo];
               endTwo--;
           }
           index -- ;
       }
        while (endOne >= 0) {
           num1[index--] = num1[endOne--];

        }
        while(endTwo>=0){
           num1[index--] = num2[endTwo--];
        }
       for(int i = 0; i <num1.length;i++){
           System.out.print(num1[i]+",");
       }
    }
}

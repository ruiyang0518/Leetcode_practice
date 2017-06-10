import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


// sort colors 
// 超过2色，扫一遍array，然后统计每个数字出现的频率，按照每个数字出现的频率，重新构建一个数组

// 排序一般的时间复杂度都是nlogn，但是如果再已知道数字的内容的情况下有可能o（n）
／／桶排序

public class solution {
  
  
  public static int[] sortColor (int[] colors){
    
    if (colors == null|| colors.length ==0){
      return ;
    }
    
    int headIndex = 0;
    int endIndex = colors.length-1;
    
    for( int i =0; i<colors.length;i++){
       if ( colors[i] ==0 &&headIndex<i){
          colors = swap(headinex,i,colors)
          headindex++;
       }else if (colors[i] ==2&& endIndex > i){
          colors = swap(endIndex,i,colors)
          endIndex--;
          i--;//assert convert element 
       }
    }
    
    return colors;
    
  } 
  
  public static int[] swap(int indexOne, int indexTwo,int[] array){
    int temp = 0;
    temp = array[indexOne];
    array[indexTwo] = array[indexOne];
    array[indexOne] = temp;
    return array;
  }

}


//时间复杂度优化，一半往nlogn，logn，n，1
//logn一般都是binary search or binary search tree


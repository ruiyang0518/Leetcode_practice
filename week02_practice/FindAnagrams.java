package week02;
import java.util.ArrayList;
import  java.util.List;
/**
 * Created by 502750454 on 6/23/2017.
 */
public class FindAnagrams {

    public static void main(String[] args) {
        List<Integer> l = findAnagrams("cbaebabacd","abc");
    }

    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> res = new ArrayList<>();
        // base case
        if(s == null || s.length() ==0 || p == null || p.length() == 0){
            return res;
        }

        // count word frequency
        int[] map = new int[256];
        for(char c : p.toCharArray()){
            map[c]++;
        }

        int left = 0;
        int right = 0;
        int counter = p.length();

        // use sliding window get every substring
        while(right < s.length()){
            if( map[s.charAt(right)]>=1){ // move right pointer
                counter --;
            }
            map[s.charAt(right)]--;
            right ++;

            if(counter==0){
                res.add(left);
            }

            if(right - left==p.length() && map[s.charAt(left++)]++ >=0){
                counter ++;
            }

        }

        return res;
    }

}

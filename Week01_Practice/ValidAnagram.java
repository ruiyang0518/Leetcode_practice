import java.util.HashMap;
import java.util.Map;

/**
 * Created by 502750454 on 6/15/2017.
 */
public class ValidAnagram {

    // this method create two map
    public boolean isAnagram(String s,String t){

        // corner case
        if (s==null || s.length()==0){
            return false;
        }
        if(t==null || t.length() ==0 ){
            return false;
        }
        if (s.length() !=t.length()){
            return false;
        }

        Map<Character,Integer> mapOne = makeMap(s);
        Map<Character,Integer> mapTwo = makeMap(t);
        if (mapOne.equals(mapTwo)){
            return true;
        }else{
            return false;
        }
    }

    public Map makeMap(String s){
        Map<Character,Integer> mapOne = new HashMap<>();
        for(int i =0; i < s.length();i++){
            char letter = s.charAt(i);
            if(mapOne.containsKey(letter)){
                mapOne.put(letter,mapOne.get(letter)+1);
            }else{
                mapOne.put(letter,1);
            }
        }
        return mapOne;
    }

    // lecture's method
    public boolean isAnagramTwo(String s, String t){
        // if the strings are the same then directly return true
        if(s.equals(t)){
            return true;
        }
        // if the length if different, false
        if (s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        // s add, t minus if the frequency is the same, the final map result should be 0
        for(int i =0; i <s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
        }

        for ( int fre:map.values()){
            if (fre !=0){
                return false;
            }
        }
        return true;
    }
}

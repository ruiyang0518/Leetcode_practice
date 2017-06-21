package week01_Homework;
/**
 * Created by ruiyang on 6/6/17.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphicAnagrams {

//    public static void main(String[] args) {
//        GraphicAnagrams ga = new GraphicAnagrams();
//        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> returns = ga.groupAnagrams(strs);
//        for (List<String> list:returns){
//            System.out.print(list);
//        }
//    }

    public List<List<String>> groupAnagrams(String[] strs) {

        //corner case
        if(strs.length==0 ){
            return null;
        }
        if (strs == null){
            return null;
        }
        List<List<String>> output = new ArrayList<>();

        Map<Map,String> map = new HashMap<>();
        for (String word:strs){
            Map<Character, Integer> wordMap = makeNewMap(word);
            if (map.containsKey(wordMap)){
                String val = map.get(wordMap) + "," + word;
                map.put(wordMap,val);
            }else {
                map.put(wordMap,word);
            }
        }

        for(String vals:map.values()){
            List<String> s = new ArrayList<>();
            s.add(vals);
            output.add(s);
        }
        return output;
    }
    public Map<Character,Integer> makeNewMap(String word){
        Map<Character,Integer> wordMap = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char letter = word.charAt(i);
            if (wordMap.containsKey(letter)){
                wordMap.put(letter,wordMap.get(letter)+1);
            }else{
                wordMap.put(letter,1);
            }
        }
        return wordMap;
    }
}

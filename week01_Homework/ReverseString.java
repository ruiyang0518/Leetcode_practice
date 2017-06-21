package week01_Homework;

/**
 * Created by 502750454 on 6/19/2017.
 */
public class ReverseString {
    //s = "hello" return "olleh"

    public static String reverseString(String s) {

        if (s==null ||s.length()==0){
            return s;
        }

        String newString = "";
        char[] stringArray = s.toCharArray();
        for(int i= s.length()-1;i>=0;i--){
            newString = newString+stringArray[i];
        }
        return newString;
    }
}

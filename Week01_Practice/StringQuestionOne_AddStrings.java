package week01_practice;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by ruiyang on 6/10/17.
 */
public class StringQuestionOne_AddStrings {

    public static String addString(String num1,String num2){
        //corner case
        if(num1 == null || num1.length()==0){
            return num2;
        }
        if (num2 == null || num2.length() == 0){
            return num1;
        }

        StringBuilder result = new StringBuilder();
        int indexOne = num1.length() - 1;//0
        int indexTwo = num2.length() - 1;//1
        // if the sum of two number bigger than 10, use forward to present the digital move forward
        int forward =0;

        // use or not and
        // because when the length of two string not in the same length, "and" will stop the remaining number in the longer string
        while( indexOne >= 0 || indexTwo >= 0){

            int numberOne=0;
            int numberTwo=0;

            // use int indexOne < 0 ? 0 : num1.charAt(indexOne) - '0'; would be better
            if (indexOne >= 0) {
                numberOne = num1.charAt(indexOne) - '0';
            }else{
                numberOne = 0;
            }

            if (indexTwo >= 0){
                numberTwo = num2.charAt(indexTwo) - '0';
            }else{
                numberTwo = 0;
            }

            result.append((numberOne + numberTwo + forward) % 10);
            forward = (numberOne + numberTwo + forward) / 10;
            // don't forget to decrease index number
            indexOne--;
            indexTwo--;
        }

        // if the caculation end and the last the sum of two number bigger than 10, then should and forward to the string
        if (forward == 1){
            result.append(forward);
        }

        // result should be reverse
        return result.reverse().toString();
    }

    @Test
    public void testAddString(){

        assertEquals("30",addString("22","8"));
        assertEquals("128",addString("","128"));
        assertEquals("230",addString("210","20"));
        assertEquals("1000",addString("999","1"));
    }


}

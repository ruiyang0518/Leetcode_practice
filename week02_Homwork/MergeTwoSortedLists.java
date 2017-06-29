package week02_Homwork;

/**
 * Created by 502750454 on 6/21/2017.
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);

        head.next = one;
        one.next = null;

        two.next = three;
        three.next = four;


        ListNode result = mergeTwoSortedLists(head,two);
    }
    public static ListNode mergeTwoSortedLists(ListNode listOne,ListNode listTwo){
        // corner case
        if(listOne == null && listTwo == null){
            return null;
        }
        if(listOne ==null && listTwo!= null){
            return listTwo;
        }
        if (listOne != null && listTwo == null){
            return listOne;
        }

        ListNode result = new ListNode(-1);
        ListNode resultCur = result;

        while (listOne!=null && listTwo!=null){
            if(listOne.val>listTwo.val){
                resultCur.next = listTwo;
                resultCur = resultCur.next;
                listTwo = listTwo.next;

            }else {
                resultCur.next = listOne;
                resultCur = resultCur.next;
                listOne = listOne.next;
            }
        }
        while(listOne!=null){
            resultCur.next = listOne;
            resultCur = resultCur.next;
            listOne = listOne.next;
        }
        while(listTwo!=null){
            resultCur.next = listTwo;
            resultCur = resultCur.next;
            listTwo = listTwo.next;
        }
        return result.next;
    }
}

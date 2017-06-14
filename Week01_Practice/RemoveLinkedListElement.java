/**
 * Created by 502750454 on 6/14/2017.
 */
public class RemoveLinkedListElement {

    public static ListNode removeElements(ListNode head, int val){
        // corner case
        if ( head == null){
            return null;
        }
        // remember to make a dummy node, because if current == head, then head's value will not be able to compare
        // with current.next
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        while(current != null && current.next != null){
            if (current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nodeOne = new ListNode(2);
        ListNode nodeTwo = new ListNode(6);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        ListNode nodeFive = new ListNode(6);
        head.next = nodeOne;
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next= nodeFive;
        nodeFive.next=null;

        removeElements (head,6);
    }
}



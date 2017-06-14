/**
 * Created by 502750454 on 6/14/2017.
 */

// how to define a cycle
public class hasCycle {

    public boolean hasCycle(ListNode head){

        //corner case
        if (head == null || head.next == null){
            return false;
        }

        // initial two pointer: fast one and slow one
        ListNode fast = head;
        ListNode slow = head.next;

        // if LinkedList not reach the end
        while(fast !=null && fast.next!=null){
            // when fast pointer meet slow pointer means that there is a cycle, and fast cycle
            // will go back through cycle and meet slow pointer again
            if ( fast == slow){
                return true;
            }
            // set the fast speed is twice as the slow pointer
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}

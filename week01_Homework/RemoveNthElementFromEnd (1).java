package hw.week01;

import hw.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 502750454 on 6/19/2017.
 */

public class RemoveNthElementFromEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(5);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;

        RemoveNthElementFromEnd re = new RemoveNthElementFromEnd();
        head = re.removeNthFromEnd(head,2);

        while(head!=null && head.next!=null){
            head = head.next;
        }

    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        //corner case
        if(head ==null || head.next == null){
            return head;
        }

        ListNode nthNode = head;
        ListNode fastNode = head;
        for(int i = 0;i<n;i++){
            fastNode = fastNode.next;
        }
        // use two pointer, the internal between two pointer is n,
        // then the slow pointer can get the nth node that before the nth node

        while(fastNode!=null&& fastNode.next!=null){
            nthNode = nthNode.next;
            fastNode = fastNode.next;
        }

        nthNode.next = nthNode.next.next;

        return head;
    }

}

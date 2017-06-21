package week01_Homework;

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

    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        //corner case
        if(head ==null || head.next == null){
            return head;
        }

        head = reverseLinkedList(head);
        ListNode dummy = new ListNode(-1);
        dummy.next=head;

        ListNode cur = dummy;
        while(cur!= null &&cur.next!=null){
            if(n == 0 ){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
                n--;
            }
        }
        head = reverseLinkedList(head);
        return head;

    }

    public ListNode reverseLinkedList(ListNode head){

        List<ListNode> elements = new ArrayList<ListNode>();
        ListNode cur = head;

        while(cur != null ){
            elements.add(cur);
            cur = cur.next;
        }

        int end = elements.size();

        for(int i = end-1;i>0;i--){
            elements.get(i).next = elements.get(i-1);
        }

        return elements.get(end-1);
    }
}

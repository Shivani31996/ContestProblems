//328. Odd Even Linked List

/*
 * 1 - We are considering taking three pointers. Odd pointer at the first node and the even and temp pointer at the second node.
 * 2- We will iterate over the entire list until the while condition is satisfied
 * 3 - After this, We will point the odd pointer next to the temp i.e. the head of the even list and return head.
 */

public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = even;
        
        while(odd.next != null && even.next != null)
        {
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        
        odd.next = temp;
        return head;
    }    
}

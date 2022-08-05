/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode r = new ListNode();
        r.next=head;
        ListNode p = r;
        while(p.next != null ) {
            if(p.next.val==val)
                p.next=p.next.next;
            else
                p=p.next;
        }
        return r.next;
    }
}
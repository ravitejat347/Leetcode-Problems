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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode s = head, f = head.next;
        ListNode t1 = f;
        while(f !=null && f.next != null){
            s.next = s.next.next;
            f.next = f.next.next;
            s = s.next;
            f =f.next;
        }
        s.next = t1;
        return head;
    }
}
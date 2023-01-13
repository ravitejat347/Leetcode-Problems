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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode s = head, f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        if(s.next == null){
            s = head;
            s.next = null;
            return head;
        }
        s.val = s.next.val;
        s.next = s.next.next;
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode p1 = headA, p2 = headB;
        while(p2 != null){
            hs.add(p2);
            p2 = p2.next;
        }
        while(p1 != null){
            if(hs.contains(p1)){
                return p1;
            }
            p1 = p1.next;
        }
        return null;
    }
}
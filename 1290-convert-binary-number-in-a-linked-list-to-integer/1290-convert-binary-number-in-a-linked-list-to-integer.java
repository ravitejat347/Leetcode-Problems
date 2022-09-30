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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int n = 0;
        double sum =0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        temp = head;
        for(int i=n-1; i>=0; i--){
             sum = sum + ((temp.val)*(Math.pow(2,i)));
            temp = temp.next;
        }
        return (int)sum;
    }
}
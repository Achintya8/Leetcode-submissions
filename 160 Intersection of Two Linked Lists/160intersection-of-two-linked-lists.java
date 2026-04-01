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
        ListNode pta=headA,ptb=headB;

        while(pta!=ptb){
            pta = pta==null ? headB : pta.next;
            ptb = ptb==null ? headA : ptb.next;
        }
        return ptb;
    }
}
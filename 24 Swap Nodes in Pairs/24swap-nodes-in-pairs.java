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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummmy = new ListNode(0);
        dummmy.next = head;
        ListNode first = head;
        ListNode nex = dummmy;

        while(head!=null && head.next!=null){
            ListNode th = head;
            ListNode t = head.next;
            nex.next = t;
            th.next = t.next;
            t.next = th;
            nex = th;
            head = th.next;
        }
        return dummmy.next;

    }
}
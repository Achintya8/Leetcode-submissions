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
    public ListNode doubleIt(ListNode head) {
            head = reverse(head);

            ListNode prev = null;
            ListNode curr = head;
            int carry=0;
            while(curr!=null){
                int newVal = curr.val*2 + carry;
                curr.val = newVal%10;
                carry = newVal/10;

                prev=curr;
                curr=curr.next;
            }
            if(carry>0){
                prev.next = new ListNode(carry);
            }
            return reverse(head);
        }
    
    public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
    while (curr != null) {
        ListNode nextNode = curr.next; 
        curr.next = prev;              
        prev = curr;                   
        curr = nextNode;              
    }
    return prev; 
}
}
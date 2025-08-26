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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        ListNode first=head;
        k=k%countnodes(head);
        while(k>0){
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode last=temp.next;
            temp.next=null;
            last.next=first;
            first=last;
            k -= 1;
        }return first;
    }

    public int countnodes(ListNode head){
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt += 1;
            temp=temp.next;
        }return cnt;
    }
}
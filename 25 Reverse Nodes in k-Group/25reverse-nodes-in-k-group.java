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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevlast=null;
        while(temp!=null){
        ListNode kthnode=findkthnode(temp,k);
        if(kthnode==null){
            if(prevlast!=null){
                prevlast.next=temp;
            }
            break;
        }
        ListNode nxtnode=kthnode.next;
        kthnode.next=null;
        reverse(temp);

        if(temp==head){
            head=kthnode;
        }else{
            prevlast.next=kthnode;
        }
        prevlast=temp;
        temp=nxtnode;
        }
        return head;
    }
    public ListNode findkthnode(ListNode temp, int k){
        k -= 1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
             }
             return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;

    }
}
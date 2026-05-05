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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode m = merged;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                m.next=list1;
                list1=list1.next;
            }else {
                m.next=list2;
                list2=list2.next;
            }
            m=m.next;
        }
        if(list1!=null){
            m.next=list1;
        }else if(list2!=null){
            m.next=list2;
        }
        
        return merged.next;
    }
}
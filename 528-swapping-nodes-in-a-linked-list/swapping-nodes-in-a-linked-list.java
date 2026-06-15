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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tmp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(tmp!=null){
            arr.add(tmp.val);
            tmp = tmp.next;
        }
        int left = k-1;
        int right = arr.size()-k;

       

        Collections.swap(arr,left,right);

        ListNode ans = new ListNode(arr.get(0));
        ListNode curr = ans;

        for(int i=1;i<arr.size();i++){
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return ans;
    }
}
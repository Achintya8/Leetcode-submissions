class Solution { // <--- This class wrapper is mandatory
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        
        // Recurse to the end of the list
        head.next = removeNodes(head.next);
        
        // If the next node is bigger than the current, delete the current
        if (head.val < head.next.val) {
            return head.next;
        }
        
        return head;
    }
}
class MyLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode n = new ListNode(val);
        n.next = head;
        head = n;
        size++;
    }
    
    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        ListNode n = new ListNode(val);
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return; 
        if (index <= 0) {         
            addAtHead(val);
            return;
        }
        
        ListNode n = new ListNode(val);
        ListNode curr = head;
        
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        
        n.next = curr.next;
        curr.next = n;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; 
        
        if (index == 0) {
            head = head.next;
        } else {
            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
           
            if (curr.next != null) {
                curr.next = curr.next.next;
            }
        }
        size--;
    }
}
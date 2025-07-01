class Solution {
    public ListNode rotateRight(ListNode head, int k) {   
        if(head == null || k == 0 || head.next == null){
            return head;
        }

        // Step 1: Find length and tail
        int len = 1;
        ListNode tail = head;  
        while(tail.next != null){
            tail = tail.next;
            len++;
        }    

        // Step 2: Normalize k
        if(k % len == 0) return head;

        // Step 3: Make circular
        tail.next = head;

        // Step 4: Walk to new tail
        int step = len - k % len; //should use k % len 
        ListNode newtail = head;
        for(int i = 1; i < step; i++){
            newtail = newtail.next;
        }

        // Step 5: Set new head and break loop
        ListNode newhead = newtail.next;
        newtail.next = null;

        return newhead;
    }
}

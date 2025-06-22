// Last updated: 6/22/2025, 11:02:56 AM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev=slow;
            slow=slow.next;


        }
        prev.next=prev.next.next;
        // ListNode temp = head;
        // while(temp!=null && temp.next!=slow){
        //     temp = temp.next;

        // }
        // temp.next = temp.next.next;
        return head;
        
    }
}
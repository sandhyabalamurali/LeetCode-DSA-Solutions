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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        // Move prev to node just before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;   // first node of sublist
        ListNode next = null;
        ListNode tail = curr; 
        for(int i=0;i<=right-left;i++){
            ListNode temp=curr.next;
            curr.next=next;
            next=curr;
            curr=temp;
        } 
        prev.next=next;
        tail.next=curr;
        return dummy.next;
    }
}
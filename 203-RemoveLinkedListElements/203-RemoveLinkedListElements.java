// Last updated: 6/22/2025, 11:04:25 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tptr=null,shadow=null;
        for(tptr=head;tptr!=null;shadow=tptr,tptr=tptr.next){
            if(tptr.val==val && tptr==head){
                head=head.next;
            }
            else if(tptr.val==val){
                shadow.next=tptr.next;
                tptr.next=null;
                tptr=shadow;

            }
        }
        return head;
        
    }
}
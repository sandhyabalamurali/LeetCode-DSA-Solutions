// Last updated: 6/22/2025, 11:04:39 AM
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmiddle(head);
        ListNode right=mid.next;
        mid.next=null;
        
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);
        return merge(leftSorted,rightSorted);
    }
    private ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode l,ListNode r){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(l!=null && r!=null){
            if(l.val<r.val){
                curr.next=l;
                l=l.next;
            }
            else{
                curr.next=r;
                r=r.next;
            }
            curr = curr.next;
        }
        if(l!=null) curr.next=l;
        if(r!=null) curr.next=r;
        return dummy.next;
    }
}
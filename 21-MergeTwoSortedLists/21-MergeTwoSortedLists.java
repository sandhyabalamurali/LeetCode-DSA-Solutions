// Last updated: 6/22/2025, 11:05:38 AM
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
    //eg l1=1->3->5 l2=2->4->->6
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0); //head->0
        ListNode node=head; //0
        while(list1!=null && list2!=null){ 
            if(list1.val<=list2.val){ 
                node.next=list1; //0->1  //0->1->3
                //System.out.print(node.next);
                list1=list1.next; //3 //5
            }
            else{
                node.next=list2; //0->1->2  //0->1->2->3->4
                list2=list2.next; //4 //5
            }
            node=node.next; //0->1->null

        }
        if(list1!=null){
            node.next=list1;
        }
        else{
            node.next=list2;
        }
        return head.next;
    }
}
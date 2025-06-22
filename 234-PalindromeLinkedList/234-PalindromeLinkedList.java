// Last updated: 6/22/2025, 11:04:18 AM
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the list
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverse(slow.next);

        // Step 3: Compare both halves
        ListNode first = head;
        ListNode second = secondHalf;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.val != second.val) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Step 4: Restore the second half (optional)
        slow.next = reverse(secondHalf);

        return isPalindrome;
    }

    // Function to reverse a linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }
}

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
    public void reorderList(ListNode head) {
        // trovo il mezzo
        ListNode slow = head; // mid sara qui
        ListNode fast = head; // diventera null
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow.next);
        ListNode firstHalf = head.next;
        slow.next = null;
        while (secondHalf != null) {
            ListNode shTmp = null;
            if (secondHalf != null)
                shTmp = secondHalf.next;
            head.next = secondHalf;
            head = head.next;
            secondHalf = shTmp;
            ListNode fhTmp = firstHalf.next;
            head.next = firstHalf;
            firstHalf = fhTmp;
            head = head.next;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}

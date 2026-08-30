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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        ListNode head = merge;
        while (list1 != null && list2 != null) {
            ListNode tmp;
            if(list1.val<=list2.val){
                tmp = list1;
                list1 = list1.next;
                merge.next = tmp;
                merge = merge.next;
            } else {
                tmp = list2;
                list2 = list2.next;
                merge.next = tmp;
                merge = merge.next;
            }
        }
        if(list1 == null){
            merge.next = list2;
        } else {
            merge.next = list1;
        }
        return head.next;
    }
}
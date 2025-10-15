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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0 , head);
        ListNode prev = dummy , temp = head;

        while(temp!=null && temp.next!=null)
        {
            ListNode one = temp.next.next;
            ListNode two = temp.next;

            two.next = temp;
            temp.next = one;
            prev.next = two;

            prev = temp;
            temp = one;
        }

        return dummy.next;
        
    }
}
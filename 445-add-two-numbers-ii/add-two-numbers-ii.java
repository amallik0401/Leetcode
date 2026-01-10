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
    ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode nn = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return nn;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int c = 0, sum = 0;
        while(h1!=null || h2!=null) {
            sum = 0;
            if(h1!=null) {
                sum += h1.val;
            }
            if(h2!=null) {
                sum += h2.val;
            }
            sum += c;
            ListNode n = new ListNode(sum%10);
            temp.next = n;
            temp = temp.next;
            c = sum/10;
            if(h1!=null) h1 = h1.next;
            if(h2!=null) h2 = h2.next;
        }
        if(c!=0) {
            temp.next = new ListNode(c);
        }
        return reverse(dummy.next);
    }
}
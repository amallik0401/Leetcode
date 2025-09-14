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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;
        int len = 0;

        while(node!=null)
        {
            node = node.next;
            len++;
        }

        if(len==1)
        {
            head =null;
            return head;
        }
        len=len-n;
        if(len==0)
        {
            head = head.next;
            return head;
        }

        node = head;
        for(int i = 1 ; i<len ; i++)
        {
            node = node.next;
        }

        node.next = node.next.next;

        return head;




        
    }
}
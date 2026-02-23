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
    public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0)
            return null;

        Queue<Integer> queue = new PriorityQueue<>();

        for(ListNode node : lists)
        {
            while(node!=null)
            {
                queue.add(node.val);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!queue.isEmpty())
        {
            curr.next = new ListNode(queue.poll());
            curr = curr.next;
        }

        return dummy.next;
    }

}
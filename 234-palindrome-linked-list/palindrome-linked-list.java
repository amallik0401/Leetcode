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
        
        List<Integer> ls = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null)
        {
            ls.add(temp.val);
            temp = temp.next;
        }

        int i = 0; 
        int j = ls.size()-1;
        while(i<j)
        {
            if(ls.get(i) != ls.get(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
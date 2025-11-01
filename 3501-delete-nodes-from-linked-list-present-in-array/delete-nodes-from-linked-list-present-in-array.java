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
class Solution 
{
    
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        HashSet<Integer> hs = (HashSet<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toSet());
            ListNode temp = head , prev = null;
            while(temp!=null)
            {
                if(hs.contains(temp.val))
                {
                    if(temp == head)
                        head = head.next;
                    else
                        prev.next = temp.next;
                }
                else
                {
                    prev=temp;
                }
                temp = temp.next;
            }
        return head;
    }    
}
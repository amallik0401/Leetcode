/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) 
    {

        return helper(root.left , root.right);
    }

    boolean helper(TreeNode ln , TreeNode rn)
    {
        if(ln==null && rn==null)
        {
            return true;
        }
        
        if(ln==null || rn==null)
        {
            return false;
        }

        if(ln.val!=rn.val)
        {
            return false;
        }

        return helper(ln.left , rn.right) && helper(rn.left , ln.right);
    }
}
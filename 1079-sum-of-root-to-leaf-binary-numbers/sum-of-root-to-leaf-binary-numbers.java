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
    int dec = 0;
    public int sumRootToLeaf(TreeNode node) {
        
    help(node , 0);

        return dec;
    }

    void help(TreeNode node ,long ans)
    {
        if(node==null)
            return;

        ans = ans*2 + node.val;

        if (node.left == null && node.right == null) {
            dec += ans;
        } else {
            help(node.left, ans);
            help(node.right, ans);
        }
    }
}
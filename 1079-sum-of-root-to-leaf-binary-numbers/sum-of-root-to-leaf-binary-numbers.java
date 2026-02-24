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
        
    StringBuilder ans = new StringBuilder();
    help(node , ans);

        return dec;
    }

    void help(TreeNode node ,StringBuilder ans)
    {
        if(node==null)
            return;

        ans.append(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            dec += Integer.parseInt(ans.toString(), 2);
        } else {
            help(node.left, ans);
            help(node.right, ans);
        }

        ans.deleteCharAt(ans.length() - 1);
    }
}
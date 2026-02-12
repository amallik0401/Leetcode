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
    public void flatten(TreeNode root) 
    {
        List<TreeNode> li = new ArrayList<>();

        pre(root , li);


        for(int i = 1 ; i < li.size() ; i++)
        {
            root.left = null;
            root.right = li.get(i);
            root = root.right;
        }
    }

    void pre(TreeNode node,List<TreeNode> li)
    {
        if(node == null)
            return;
        
        li.add(node);
        pre(node.left , li);
        pre(node.right , li);
    }
}
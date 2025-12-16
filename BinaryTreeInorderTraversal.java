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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root==null)
        {
            return ans;
        }
        else
        {
            help(root,ans);
        }
       return ans; 
    }
    private void help(TreeNode root, List<Integer> ans) {
        if (root==null)
        {
            return;
        }
        else
        {
            help(root.left,ans);
            ans.add(root.val);
            help(root.right,ans);
        }
    }
}
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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        isBalancedHelper(root);
        return flag;
    }
    
    public int isBalancedHelper(TreeNode root) {
        if(root==null) return 0;
        int leftH=isBalancedHelper(root.left);
        int rightH=isBalancedHelper(root.right);
        if(Math.abs(leftH-rightH)>1) flag=false;
        return 1+Math.max(leftH,rightH);
    }
}
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
    private static boolean pathsum(TreeNode root,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
           return root.val==sum;
        }
        if(pathsum(root.left,sum-root.val) || pathsum(root.right,sum-root.val)){
            return true;
        }
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return pathsum(root,targetSum);
    }
}
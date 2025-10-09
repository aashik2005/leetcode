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
    private static boolean find(HashMap<Integer,Integer> map,int k,TreeNode root){
        if(root==null){
            return false;
        }
        int diff=k-root.val;
        if(map.containsKey(diff)){
            return true;
        }
        else{
            map.put(root.val,0);
        }
        return find(map,k,root.left)||find(map,k,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        return find(map,k,root);
    }
}
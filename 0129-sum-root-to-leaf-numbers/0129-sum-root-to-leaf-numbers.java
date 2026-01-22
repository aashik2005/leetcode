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
    private static void dfs(TreeNode node,int val,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        val=val*10+node.val;
        if(node.left==null && node.right==null){
            list.add(val);
            return;
        }
        else{
            dfs(node.left,val,list);
            dfs(node.right,val,list);
        }
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
         dfs(root,0,list);
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
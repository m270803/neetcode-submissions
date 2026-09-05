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
    int cnt = 0;
    public int goodNodes(TreeNode root) {
        countNode(root,Integer.MIN_VALUE);
        return cnt;
    }
    private void countNode(TreeNode node,int parent){
        if(node == null){
            return;
        }
        if(node.val >= parent){
            cnt++;
        }
        parent = Math.max(parent,node.val);
        countNode(node.left,parent);
        countNode(node.right,parent);
    }
}

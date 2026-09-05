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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i],i);
        }

        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);

    }
    private TreeNode build(int[] preOrder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,HashMap<Integer,Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;
        TreeNode node = new TreeNode(preOrder[preStart]);
        int inRoot = map.get(node.val);
        int numLeft = inRoot - inStart;
        node.left = build(preOrder,preStart+1,preStart+numLeft,inorder,inStart,inRoot-1,map);
        node.right = build(preOrder,preStart+numLeft+1,preEnd,inorder,inRoot+1,inEnd,map);
        return node;
    }
}

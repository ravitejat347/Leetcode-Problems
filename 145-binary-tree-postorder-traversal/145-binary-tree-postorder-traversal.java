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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return postOrder(list, root);
    }
    public List<Integer> postOrder(List<Integer> list, TreeNode root){
        if(root == null){
            return list;
        }
        postOrder(list, root.left);
        postOrder(list, root.right);
        list.add(root.val);
        
        return list;
    }
}
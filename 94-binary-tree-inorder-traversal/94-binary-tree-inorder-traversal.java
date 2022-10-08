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
        List<Integer> list = new ArrayList<>();
        return inorder(list, root);
    }
    public List<Integer> inorder(List<Integer> list, TreeNode root){
        if(root == null){
            return list;
        }
        inorder(list, root.left);
        if(root != null){
            list.add(root.val);
        }
        inorder(list, root.right);
        return list;
    }
}
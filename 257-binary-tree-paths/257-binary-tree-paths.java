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
    
    List<String> ans = new ArrayList<>();
    
    public void dfs(TreeNode root, String res){
       if(root == null){
            return;
        }
         
        if(root.left == null && root.right == null){
            res += root.val;
            ans.add(res);
        } else {
            res += root.val+"->";
        }
        
        dfs(root.left, res);
        dfs(root.right, res); 
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        String res = "";
        dfs(root, res);
        return ans;
    }
}
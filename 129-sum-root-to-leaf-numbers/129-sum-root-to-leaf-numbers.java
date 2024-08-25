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
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    public void dfs(TreeNode root, List<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.val);
        
        if(root.left == null && root.right == null){
             ans.add(new ArrayList<>(path));
        }
        
        dfs(root.left, path);
        dfs(root.right, path);
        
        path.remove(path.size()-1);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> path = new ArrayList<Integer>();
        dfs(root, path);
        
        int res = 0;
        for(List<Integer> list: ans){
            int num = 0;
            for(Integer x: list){
               num = num*10 + x;
            }
            res += num;
        }
        
        return res;
    }
}
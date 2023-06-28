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
    public List<Integer> leftSideView(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        leftView(root,result,0);
        return result;
    }
    public void leftView(TreeNode root,List<Integer> result,int currDepth){
        if(root==null){
            return;
        }
        if(currDepth==result.size()){
            result.add(root.val);
        }
        leftView(root.left,result,currDepth+1);
        leftView(root.right,result,currDepth+1);
    }
}

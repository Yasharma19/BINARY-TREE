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

    public static void swap(TreeNode root){
        if(root==null){
            return;
        }
        swap(root.left);
        swap(root.right);
      
        /*swapping all left to right*/
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public TreeNode invertTree(TreeNode root) {
    /*MIRROR IMAGE OF TREE*/
    swap(root);
    return root;

    }
}

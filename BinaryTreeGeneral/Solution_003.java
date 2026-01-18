package Leetcode.BinaryTreeGeneral;

public class Solution_003 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode n1 = invertTree(root.right);
        TreeNode n2 = invertTree(root.left);
        root.left = n1;
        root.right = n2;
        return root;
    }
}
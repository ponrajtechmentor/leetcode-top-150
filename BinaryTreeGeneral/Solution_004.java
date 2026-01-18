package Leetcode.BinaryTreeGeneral;

public class Solution_004 {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
    public boolean check(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null){
            return true;
        }
        else if(n1 != null && n2 != null && n1.val == n2.val){
            return check(n1.left, n2.right) && check(n1.right, n2.left);
        }
        else {
            return false;
        }
    }
}

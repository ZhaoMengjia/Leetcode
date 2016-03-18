/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }else if ((p == null && q != null) || (p != null && q == null) || p.val != q.val){
            return false;
        }
        else{
            boolean leftCom = isSameTree(p.left, q.left);
            boolean rightCom = isSameTree(p.right, q.right);
            return (leftCom && rightCom);
        }
    }
}
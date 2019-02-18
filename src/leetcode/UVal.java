/*
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

Input: [1,1,1,1,1,null,1]
Output: true

Input: [2,2,2,5,2]
Output: false
*/


package leetcode;


public class UVal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isUnivalTree(TreeNode root){
        return recursiveCheck(root, root.val);
    }

    public static boolean recursiveCheck(TreeNode node, int val){
        if(node != null && node.val != val){
            return false;
        }
        if(node == null){
            return true;
        }
        return recursiveCheck(node.right, val) && recursiveCheck(node.left, val);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(isUnivalTree(root));
    }

}

package trees;

import java.util.Stack;

public class BinaryTree {

    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    //recursive solution
    public void inorder(TreeNode root){
        TreeNode copy = root;
        if(copy != null){
            inorder(copy.left);
            System.out.println(copy.data);
            copy = root;
            inorder(copy.right);
        }
    }

    // Recursive Solution
    public void preorder(TreeNode root){
        if(root !=  null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // non recursive in order traversal
    public void nonrecursiveInorder(TreeNode root){
        TreeNode copyofRoot = root;
        Stack<TreeNode> inorderstack = new Stack<>();

        while (copyofRoot !=null || inorderstack.size() > 0) {
            while (copyofRoot != null) {
                inorderstack.push(copyofRoot);
                copyofRoot = copyofRoot.left;
            }

            copyofRoot = inorderstack.pop();
            System.out.println(copyofRoot.data);
            copyofRoot = copyofRoot.right;
        }
    }




    public static void main(String[] args)
    {
        BinaryTree bi = new BinaryTree();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("*********************************** Recursive Preorder Traversal ***********************************************");
        bi.preorder(rootNode);
        System.out.println("*********************************** Recursive Inorder Traversal ***********************************************");
        bi.inorder(rootNode);
        System.out.println("*********************************** Non Recursive Inorder Traversal ***********************************************");
        bi.nonrecursiveInorder(rootNode);
    }

    public static TreeNode createBinaryTree()
    {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);
        rootNode.left = node20;
        rootNode.right = node60;
        node20.left = node10;
        node20.right = node30;
        node60.left = node50;
        node60.right = node70;
        return rootNode;
    }

}
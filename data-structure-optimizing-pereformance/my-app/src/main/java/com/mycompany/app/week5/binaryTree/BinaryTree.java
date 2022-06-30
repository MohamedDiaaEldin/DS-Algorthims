package com.mycompany.app.week5.binaryTree;

public class BinaryTree<E> {
    TreeNode<E> root;

    public BinaryTree(){
        root = new TreeNode<E>(null, null) ;
    }

    private void preOrder(TreeNode<E> node){
        if (node != null){
            System.out.println(node.getData());
            node.visit() ; 
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public void preOrder(){
        preOrder(root);
    }
}

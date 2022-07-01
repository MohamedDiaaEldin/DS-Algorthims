package com.mycompany.app.week5.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
    TreeNode<E> root;

    public BinaryTree() {
        root = new TreeNode<E>(null, null);
    }

    // depth first traversal
    private void preOrder(TreeNode<E> node) {
        if (node != null) {
            node.visit();
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    // breadth first traversal
    public void levelOrder() {
        Queue<TreeNode<E>> visited = new LinkedList<>();
        visited.add(root);
        while ( ! visited.isEmpty() ) {
            TreeNode<E> cur = visited.remove();
            if (cur != null) {
                cur.visit();
                if (cur.getLeftChild() != null){
                    visited.add(cur.getLeftChild());
                }
                if( cur.getRightChild() != null){
                    visited.add(cur.getRightChild());
                }
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }
}

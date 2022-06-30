package com.mycompany.app.week5.binaryTree;

public class TreeNode<E> {

    private TreeNode<E> parent;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;
    private E data;
    private boolean visited;

    public TreeNode(E data, TreeNode<E> parent) {
        this.parent = parent;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        visited = false;
    }

    public TreeNode<E> addLeftChild(E data) {
        this.leftChild = new TreeNode<E>(data, this);
        return this.leftChild;
    }

    public TreeNode<E> addRightChild(E data) {
        this.rightChild = new TreeNode<E>(data, this);
        return this.rightChild;
    }

    public TreeNode<E> getLeftChild() {
        return this.leftChild;
    }

    public TreeNode<E> getRightChild() {
        return this.rightChild;
    }

    public E getData() {
        return this.data;
    }

    public void visit() {
        visited = true;
    }

}

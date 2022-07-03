package com.mycompany.app.week5.binaryTree;

public class Main {

    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();

        // tree.insertIteration(10) ;
        // tree.insertIteration(20) ;
        // tree.insertIteration(8) ;

        tree.insertRec(10);
        tree.insertRec(20);
        tree.insertRec(8);
        tree.insertRec(2);
        tree.insertRec(1);
        tree.insertRec(0);

        
        tree.levelOrder();
        tree.delete(50);
        System.out.println();
        tree.levelOrder();
    

    }

}

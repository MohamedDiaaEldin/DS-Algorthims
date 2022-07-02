package com.mycompany.app.week5.binaryTree;

import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.util.ElementScanner6;

public class BSTree<E extends Comparable<E> > {
    TreeNode<E> root;

    public BSTree() {
        root = new TreeNode<E>(null, null);
    }

    // depth first traversal
    private void preOrder(TreeNode<E> node) {
        if (node != null) {
            node.visit();
            System.out.println(node.getData());
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
            System.out.println(cur.getData());
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
    
    public boolean searchRec(TreeNode<E> node, E element){
        if(node == null){
            return false ;
        }
        else if( element.compareTo(node.getData()) == 0){
            return true ; 
        }
        else if (element.compareTo(node.getData()) > 0){
            return searchRec( node.getRightChild(),  element) ; 
        }else{
            return searchRec( node.getLeftChild(),  element) ; 
        }        
    }

    public boolean contains(E element){        
        return searchRec(root, element); 
    }

    public boolean conatinsIteration(E element){        
        TreeNode<E> cur = root ;
        while ( cur != null ){    
            int comp = element.compareTo(cur.getData()) ;
            if (comp  == 0 ){
                return true ;
            }
            else if (comp > 0){
                cur = cur.getRightChild() ;
            }
            else{
                cur = cur.getLeftChild() ; 
            }
        }

        return false ;
    }

    public boolean insertIteration(E element){        
        TreeNode<E> cur = root ; 
        if(cur.getData() == null){
            cur.setData(element);
            return true ;             
        }
        int comp = element.compareTo(cur.getData()) ; 

        while (comp < 0 && cur.getLeftChild() != null || comp > 0 && cur.getRightChild() != null){
            if(comp < 0){
                cur = cur.getLeftChild() ;                
            }
            else { 
                cur = cur.getRightChild() ;                 
            }            
            comp = element.compareTo(cur.getData()) ; 
        }
        //
        if(comp < 0){
            cur.addLeftChild(element) ;
        }
        else if (comp > 0){
            cur.addRightChild(element) ; 
        }  
        else{
            return false ; 
        }

        return true  ;        
    }

    public boolean insert(TreeNode<E> node , E element){
        int comp = element.compareTo(node.getData()) ;
        if (comp > 0 && node.getRightChild() != null){
            return insert(node.getRightChild(), element) ;
        }
        else if (comp < 0 && node.getLeftChild() != null){
            return insert(node.getLeftChild(), element) ; 
        }
        if(comp < 0){
            node.addLeftChild(element) ;
        }
        else if (comp > 0){
            node.addRightChild(element) ; 
        }  
        else{
            return false ; 
        }        
        return true;
    }
    public boolean insertRec(E element){
        if (root.getData() == null){
            root.setData(element);
            return true ;
        }
        return insert(root, element) ;
    }

    public void preOrder() {
        preOrder(root);
    }
}

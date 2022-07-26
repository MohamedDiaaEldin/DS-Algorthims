package com.mycompany.app.week4;

public class ListNode<E> {
    ListNode<E> next ;
    ListNode<E> prev ;
    E data ; 

    public ListNode(E data){
        this.data = data ;
    }

    public String toString(){
        return this.data.toString() ; 
    }
    
}

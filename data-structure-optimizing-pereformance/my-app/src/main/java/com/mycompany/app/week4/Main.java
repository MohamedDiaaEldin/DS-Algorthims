package com.mycompany.app.week4 ;
// import org.junit.* ;

public class Main {

  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.addFront(10);
    list.addFront(20);
    list.addFront(30);
    list.addFront(40);
    list.addFront(50);
    list.addFront(60);

    // list.addLast(40);
    // list.addLast(10);
    // list.addLast(200);
    // list.addLast(4300);
    // list.addLast(1000);
    // list.addLast(20);
    // list.addLast(320);
    // list.addLast(500);

    System.out.println(list);
    // list.set(0, 99999999) ;
    // System.out.println(list);
  
    // first 
    list.removeFirst();    
    list.removeFirst();    
    list.removeFirst();    
    list.removeFirst();    
    list.removeFirst();    
    list.removeFirst();    
    // list.removeFirst();    
    // list.test();
    System.out.println(list);

    
  }
}

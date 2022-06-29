package week4;


public class Main {

  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.addFront(10);
    list.addFront(20);
    list.addFront(30);
    list.addFront(40);
    list.addFront(50);
    list.addFront(50);

    // list.addLast(40);
    // list.addLast(10);
    // list.addLast(200);
    // list.addLast(4300);
    // list.addLast(1000);
    // list.addLast(20);
    // list.addLast(320);
    // list.addLast(500);

    System.out.println(list);
    list.set(0, 99999999) ;
    System.out.println(list);
  
    // list.removeLast();    
    // list.test();
    // System.out.println(list);

    
  }
}

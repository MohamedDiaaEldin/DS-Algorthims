package week4;


public class Main {

  public static void main(String[] args) {
    

    // list.addFront(10);
    // list.addFront(60);
    // list.addFront(70);

    // list.addlast(10);
    // list.addlast(60);
    // list.addlast(70);
    // list.addlast(80);

    // System.out.println(list);

    // System.out.println(list.get(3));

    // LinkedList<Integer> list = new LinkedList<>();
    MyLinkedList<Integer> list = new MyLinkedList<>();
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);

    System.out.println(list);

    list.set(5, 100);

    System.out.println(list);

  }
}

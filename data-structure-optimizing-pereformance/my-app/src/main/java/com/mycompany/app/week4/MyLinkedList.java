package com.mycompany.app.week4;

/**
 * get(int index)
 * size()
 * set(int index, E element)
 * addLast() - addFirst()
 * removeLast() - removeFirst()
 */
public class MyLinkedList<E> {
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public MyLinkedList() {
        size = 0;
        this.head = new ListNode<E>(null);
        this.tail = new ListNode<E>(null);

        // link nodes
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    // O(n/2) = O(n)
    public void set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ListNode<E> cur = null;
        if (index > size / 2) {
            // start with tail

            cur = tail.prev;
            int i = size - 1;
            while (cur != null) {
                if (i == index) {
                    break;
                }
                cur = cur.prev;
                i--;
            }
            cur.data = element;
        } else {
            // start from head
            cur = head.next;
            int i = 0;
            while (cur != null) {
                if (i == index) {
                    break;
                }
                cur = cur.next;
                i++;
            }
            cur.data = element;
        }
    }

    // O(1)
    public void addLast(E data) {
        ListNode<E> newNode = new ListNode<E>(data);
        newNode.prev = tail.prev;
        tail.prev = newNode;
        newNode.prev.next = newNode;
        newNode.next = tail;
        size++;
    }

    // O(n/2) = O(n)
    public E get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        ListNode<E> cur = null;
        if (index > size / 2) {
            int i = size - 1;
            cur = this.tail.prev;
            while (cur != null) {
                if (index == i) {
                    break;
                }
                i--;
                cur = cur.prev;
            }
            return cur.data;

        } else {
            cur = this.head.next;
            int i = 0;
            while (cur != null) {
                if (index == i) {
                    break;
                }
                cur = cur.next;
                i++;
            }
            return cur.data;
        }

    }

    /// O(1)
    public void addFront(E data) {
        ListNode<E> newNode = new ListNode<E>(data);
        newNode.prev = head;
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        this.size++;
    }

    // O(1)
    public int getSize() {
        return this.size;
    }

    // O(1)
    public void removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("list in empty");
        }
        this.tail.prev.prev.next = this.tail;
        this.tail.prev = this.tail.prev.prev;
        size--;
    }

    // O(1)
    public void removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("list in empty");
        }
        head.next.next.prev = head;
        head.next = head.next.next;
        size--;
    }

    // O(n)
    public String toString() {
        // if head is connected with the tail
        if (head.next.next == null) {
            return "[]";
        }
        StringBuilder listData = new StringBuilder();
        listData.append("[ ");
        ListNode<E> cur = this.head.next;

        while (cur.next.next != null) {
            listData.append(cur.data + " , ");
            cur = cur.next;
        }
        listData.append(cur.data + " ]");
        return listData.toString();
    }
}

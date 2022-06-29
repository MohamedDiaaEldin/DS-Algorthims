package week4;

import org.w3c.dom.NodeList;

public class MyLinkedList<E> {
    private ListNode<E> head ;    
    private ListNode<E> tail ;
    private int size ;
    
    
    public MyLinkedList(){
        size = 0 ;
        this.head = new ListNode<E>(null) ;
        this.tail = new ListNode<E>(null) ;
        
        // link nodes 
        this.head.next = this.tail ; 
        this.tail.prev = this.head ; 
    }

    /**     
     *  get
     *  set 
     *  add
     *  remove 
     *      n0->n2->n1
     */

    

     public void set(int index, E element){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        ListNode<E> cur = null ; 
        if (index > size/2){
            // start with tail 
          
            cur = tail.prev ; 
            int i = size-1 ;
            while (cur != null){
                System.out.println("index: " + i + " cur value: " + cur.data);
                if( i==index){
                    break;
                }
                cur = cur.prev ;
                i-- ;
            }
            cur.data = element ;
        }
        else{
            // start from head 
            cur = head.next ; 
            int i = 0 ;
            while (cur != null){
                if( i==index){
                    break;
                }
                cur = cur.next;
                i++ ;
            }
            cur.data = element ;
        }
     }

     public void addLast(E data){
        ListNode<E> newNode = new ListNode<E>(data) ; 
        
        this.tail.prev.next = newNode;
        newNode.next = tail;
        this.tail.prev = newNode ;
        size ++ ;
     }


     /// enhance implementaion 
     
    public E get(int index){
        if( index >= this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        
        ListNode<E> cur = this.head.next ; 
        System.out.println(cur.data);
        int i = 0 ;
        while( cur != null ){
            if( index == i){
                break ;
            }
            cur = cur.next ;
            i ++ ;
        }
        return cur.data;        
    }

     public void addFront(E data){
        ListNode<E> newNode = new ListNode<E>(data) ;   

        // course solution 
        newNode.next = head.next ; 
        newNode.prev = head.next.prev ; 
        head.next = newNode ; 
        this.size ++ ;

        // another solution 
        // ListNode<E> temp = head.next ; 
        // this.head.next = newNode ;
        // temp.prev = newNode ; 
        // newNode.next = temp ; 
        // newNode.prev= this.head ;     
     }


     public int getSize(){
        return this.size ; 
     }

     public String toString(){
        if( head.next.next == null){
            return "[]" ;
        }
        StringBuilder listData =  new StringBuilder() ; 
        listData.append("[ ") ;
        ListNode<E> cur = this.head.next ; 
        
        while( cur.next.next != null){
            listData.append( cur.data + " , ") ; 
            cur = cur.next;
        }
        listData.append(cur.data + " ]") ;
        return listData.toString(); 
     }
}

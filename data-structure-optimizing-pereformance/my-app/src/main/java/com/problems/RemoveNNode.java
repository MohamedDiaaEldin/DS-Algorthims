package com.problems;

public class RemoveNNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // O(n)
    public  ListNode removethFormEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0, head) ; 
        ListNode left = dummy ; 
        ListNode right = head ; 
        for(int i=0 ;  i < n && right != null ; i++){
            right = right.next ;     
        }   
        while (right != null){
            left = left.next;
            right = right.next ;             
  
        }
        left.next = left.next.next ;
        return dummy.next ; 
    }

    public static void main(String[] args) {

    }
}

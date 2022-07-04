package com.problems;

public class AddTwoNumber {

    public static class ListNode {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode cur1 = l1 ;
        ListNode cur2 = l2;
        ListNode result = new ListNode() ; 
        ListNode cur = result ; 
        int prev = 0 ; 
        while( cur1 != null || cur2 !=null || prev != 0){
            int val1 = cur1!=null ? cur1.val : 0 ; 
            int val2 = cur2!=null ? cur2.val : 0 ; 

            // calculate sum 
            int sum = val1 + val2 + prev ;            
            prev = sum / 10 ; 
            sum = sum%10  ;
            cur.next = new ListNode(sum) ;

            //update pointers
            cur = cur.next ; 
            cur1 = cur1!=null && cur1.next != null ? cur1.next : null ; 
            cur2 = cur2!=null && cur2.next != null ? cur2.next : null ; 
        }
        return result.next ;
    }


    public static void main(String[] args) {
        // first list 
        ListNode l1t = new AddTwoNumber.ListNode(3) ; 
        ListNode l1s = new AddTwoNumber.ListNode(4, l1t) ; 
        ListNode l1 = new AddTwoNumber.ListNode(2, l1s) ; 
        // second list 
        ListNode l2t = new AddTwoNumber.ListNode(4) ; 
        ListNode l2s = new AddTwoNumber.ListNode(6, l2t) ; 
        ListNode l2 = new AddTwoNumber.ListNode(5, l2s) ; 
        
        ListNode result  = addTwoNumbers(l1, l2) ;

        ListNode cur = result ; 
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next ;
        }
            
     

    }   

}

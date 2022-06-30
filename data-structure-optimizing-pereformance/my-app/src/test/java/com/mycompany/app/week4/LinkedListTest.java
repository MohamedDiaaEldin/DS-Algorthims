
package com.mycompany.app.week4;
import org.junit.Before ;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
/*
 *  code to setup tests
 *  code to perform tests
 *  code to cleanup tests
 */
public class LinkedListTest{
    
    MyLinkedList<String> strList  ; 
    MyLinkedList<Integer> intList  ; 
    MyLinkedList<Integer> emptyList  ; 


    @Before
    public void setUpTest() {
        // string list 
        strList = new MyLinkedList<>();
        strList.addLast("mohamed");
        strList.addLast("ali");
        strList.addLast("hosam");
        strList.addLast("zaki");
        strList.addLast("soltan");

        // integer list 
        intList = new MyLinkedList<>();
        for (int i=0 ; i<20 ; i++){
            intList.addLast(i);
        } 

        // empty list 
        emptyList = new MyLinkedList<>();
        
    }

    @Test 
    public void testSize(){
        assertEquals("empty list ", 0, emptyList.getSize());
        assertEquals("list with 5 elements", 5, strList.getSize());
    }
    
    @Test
    public void testGet(){
        try{
            emptyList.get(0) ; 
            fail("check out the bounds");
        }
        catch(IndexOutOfBoundsException e){

        }        
        try{
            emptyList.get(-1) ; 
            fail("check out the bounds");
        }
        catch(IndexOutOfBoundsException e){

        }

        try{
            strList.get(-1) ; 
            fail("check out the bounds");
        }
        catch(IndexOutOfBoundsException e){

        }

        /// test string list 
        System.out.println(strList);
        assertEquals("check first ", "mohamed", strList.get(0));
        assertEquals("check second ", "zaki", strList.get(3));    
        assertEquals("check fifth", "soltan", strList.get(4)); 
    }


    @Test
    public void testSet(){
        try{
            emptyList.set(0, 10);
            fail("check out of bounds ");
        }   
        catch(IndexOutOfBoundsException e){

        }

        try{
            strList.set(-1, "new value");
            fail("check out of bounds");
        }
        catch(IndexOutOfBoundsException e){

        }



        strList.set(0, "mohamed diaa") ;
        strList.set(2, "second") ;
        strList.set(4, "fourth") ;
        assertEquals("set first index 0",  "mohamed diaa",strList.get(0));
        assertEquals("set middle index 2",  "second",strList.get(2));
        assertEquals("set last index 4",  "fourth",strList.get(4));


    }


    @Test
    public void testRemoveFirst(){
        try{
            emptyList.removeFirst();
            fail("check out of bounds");
        }
        catch(IndexOutOfBoundsException e){

        }
        strList.removeFirst();
        assertEquals("current first element", "ali", strList.get(0));
        assertEquals("size after removing", 4 , strList.getSize());


    }


    @Test
    public void testRemovelast(){
        strList.removeLast();
       assertEquals("check current last", "zaki", strList.get(strList.getSize()-1));
       assertEquals("check current size", 4, strList.getSize());

    }


    @Test 
    public void testAddFront(){
        strList.addFront("data");
        assertEquals("check first ", "data", strList.get(0));
        assertEquals("check first ", "mohamed", strList.get(1));
    }

    
}
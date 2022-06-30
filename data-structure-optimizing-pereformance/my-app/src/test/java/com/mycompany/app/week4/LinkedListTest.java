
package com.mycompany.app.week4;


import com.mycompany.app.week4.MyLinkedList;

import org.junit.Assert.* ; 
import org.junit.Before ;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After ; 
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

        // integer list 
        intList = new MyLinkedList<>();
        for (int i=0 ; i<20 ; i++){
            intList.addLast(i);
        } 

        // empty list 
        emptyList = new MyLinkedList<>();  
        
    }

    @Test
    public void testGet(){
        try{
            emptyList.get(0) ; 
            fail("check out the bounds");
        }
        catch(IndexOutOfBoundsException e){

        }

        /// test string list 
        assertEquals("check first ", "mohamed", strList.get(0));
        assertEquals("check first ", "ali", strList.get(1));
    }

    @Test
    public void testGett(){
        try{
            emptyList.get(0) ; 
            fail("check out the bounds");
        }
        catch(IndexOutOfBoundsException e){

        }

        /// test string list 
        assertEquals("check first ", "mohamed", strList.get(0));
        assertEquals("check first ", "ali", strList.get(1));
    }




}
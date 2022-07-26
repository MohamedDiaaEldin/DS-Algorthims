package com.mycompany.app.week2;

public class ForEach{

    public static void main(String[] args) {
        String text  = "mohamed" ;         
        char[] name  = text.toCharArray() ;         
        
        /// while not replace char 
        for (char c : name){
            if (c == 'h'){
                c = 'L' ; 
            }            
        }
        System.out.println(name);


        // will replace char 
        for (int i=0 ; i<name.length ; i++){
            if( name[i] == 'h'){
                name[i] = 'L' ; 
            }
        }
        System.out.println(name);
        System.out.println(new String(name));
    }
}
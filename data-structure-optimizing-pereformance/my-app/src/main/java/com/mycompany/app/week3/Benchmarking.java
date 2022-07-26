package com.mycompany.app.week3;


public class Benchmarking{
    

    public static void main(String[] args) {
        double small = bench();
        double large = bench_large();
        System.out.println("small " + small);
        System.out.println("large " + large);

    }

    private static double bench(){
        long start_time = System.nanoTime();
        // some algorithm 
        for(int i=0 ; i<100000; i++){
            System.out.println("yes");
        }
        long end_time = System.nanoTime();
        double est_time = (end_time - start_time) / 1000000000 ;         
        return est_time ; 
    }
     
    
    private static double bench_large(){
        long start_time = System.nanoTime();
        // some algorithm 
        for(int i=0 ; i<10000000 ; i++){
            System.out.println("yes");
        }
        long end_time = System.nanoTime();
        double est_time = (end_time - start_time) / 1000000000 ; 
        return  est_time ; 
    }
}
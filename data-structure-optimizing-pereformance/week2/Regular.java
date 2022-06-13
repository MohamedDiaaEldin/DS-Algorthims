package week2;

public class Regular{

    /*
     *      + one or more 
     *      * zero ore more 
     *      | or 
     *      [123] matchs one of these
     *      [1-3] ranges with numbers 
     *      [a-s] ranges  with letters
     *      [^a-f] ^ exclude --> exculde a to f   
     */

     
    public static void main(String[] args) {
        String tesxt = "abcdef" ; 
        String[] words = tesxt.split("[a-b] "); 
        for (String word : words){
            System.out.println("word: " + word);
        }

    }  
}
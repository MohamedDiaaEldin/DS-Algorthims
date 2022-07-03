package com.problems;

import java.util.HashMap;

public class TwoSum {
    
    // Solution 1
    // Time Complexity: O(n^2)
    //  Space Complexity: O(1)
    public static int[] TwoSum(int[] nums, int target){
        int length = nums.length ; 
        for (int i=0 ; i < length-1; i++){
            for ( int j=i+1 ; j < length ; j++){
                
                if (nums[i] + nums[j] == target){
                    int[] indexes = new int[2]; 
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes; 
                }
            }
        }
        return null ; 
    }

    /*  Solution 2
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
     
    public static int[] TwoSumV(int[] nums, int target){
        HashMap<Integer, Integer> indexMap = new HashMap<>() ; 
        for (int i=0 ; i<nums.length ; i++){
            Integer requiredNumber = target - nums[i] ;
            System.out.println(requiredNumber +  " " + nums[i]);            
            if (indexMap.containsKey(requiredNumber)){
                int indexes[] = {indexMap.get(requiredNumber), i} ; 
                return indexes;
            }
            indexMap.put((nums[i]), i) ; 
        }
        return null ;
    }
    
    public static void main(String[] args) {
        int[] nums = { 7, 2, 13 ,11 } ; 
        int[] indexes = TwoSumV(nums , 9) ;
         System.out.println("[ " +  indexes[0] + ", " + indexes[1] + " ]"); 

    }
}

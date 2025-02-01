/*

import java.util.*;

class Main {
    public static void pairs(int nums[]){
        for(int i= 0; i< nums.length; i++){
           int curr = nums[i];
           for(int j= i + 1; j < nums.length; j++){
                System.out.println("("+curr+","+nums[j]+")");  
           }
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int nums[]= {1,2,3,4,5,6};
        rev(nums);
    }
}
*/


/*
import java.util.*;

class Main {
    public static void rev(Vector<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;

        while (low < high) {
            int temp = nums.get(high);
            nums.set(high, nums.get(low));
            nums.set(low, temp);
            low++;
            high--;
        }
        System.out.println(nums);
    }



    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        rev(nums);
    }
}

*/


/*
Question 1: Given an integer array nums, return true if any value appears at least twice in the 
array, and return false if every element is distinct. 
Example 1: 
Input: 
nums = [1, 2, 3, 1] 
Output: true 
Example 2: 
Input: 
nums = [1, 2, 3, 4] 
Output: false 
Example 3: 
Input: 
nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] 
Output: true 
Constraints: 
•  1 <= nums . lengtth <= 10^5 
•  -10^9 <= nums [ i ] <= 10^9 

class Main {
    public boolean leastTwice(int nums[], int n){
    
        for(int i= 0; i< n; i++){
            for(int j= i+1; j< n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
            return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int n = nums.length;
        Main m = new Main();
        System.out.println(m.leastTwice(nums, n));
    }
}

using hashSet...
class Main {
    public boolean leastTwice(int nums[], int n){
        HashSet <Integer> set = new HashSet<>();
        for(int i= 0; i< n; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

*/


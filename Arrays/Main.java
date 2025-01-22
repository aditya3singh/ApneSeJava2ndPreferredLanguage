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

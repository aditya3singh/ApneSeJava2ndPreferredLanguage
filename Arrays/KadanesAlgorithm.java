
class KadanesAlgorithm {
    
    public static void KadanesAlgo(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i= 0; i< nums.length; i++){
            currSum += nums[i];
            if(currSum < 0) currSum = 0;
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
    
    public static void main(String[] args) {
        int nums[] = {-2, -4};
        KadanesAlgo(nums);
    }
}


or



class KadanesAlgorithm {
    
    public static void KadanesAlgo(int nums[]){
        int maxSum = nums[0];
        int currSum = 0;
        for(int i= 1; i< nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
    
    public static void main(String[] args) {
        int nums[] = {-2, -4};
        KadanesAlgo(nums);
    }
}

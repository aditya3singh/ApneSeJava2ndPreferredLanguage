class InsertionSort {
    public static void InsertionSortFn(int nums[]){
        for(int i= 1; i< nums.length; i++){
            int curr = nums[i];
            int prev= i - 1;
            while(prev >= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }
    
    public static void printFn(int nums[]){
        for(int i= 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,2,6,3,7};
        InsertionSortFn(nums);
        printFn(nums);
    }
}

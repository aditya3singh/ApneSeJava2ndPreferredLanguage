// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CountingSorts {
    public static void CountingSort(int nums[]){
        int n= nums.length;
        int largest = Integer.MIN_VALUE;
        for(int i= 0; i< nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }
        
        int count[] = new int[largest + 1]; 
        for(int i= 0; i< n; i++){
            count[nums[i]]++;
        }
        
        int j= 0;
        for(int i= 0; i< count.length; i++){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printFunction(int nums[]){
        for(int i= 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,7,1,6,2,8,4,7,3,0,3};
        CountingSort(nums);
        printFunction(nums);
        
    }
}

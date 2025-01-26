
class BubbleSorts {
    public static void BubbleSort(int nums[]){
        int n= nums.length;
        for(int turn= 0; turn< n- 1; turn++){
            for(int i= 0; i< n- 1 - turn; i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+ 1] = temp;
                }
            }
        }
    }
    public static void printArr(int nums[]){
        int n= nums.length;
        for(int i= 0; i< n; i++){
            System.out.print(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,2,6,3,9};
        BubbleSort(nums);
        printArr(nums);
    }
}

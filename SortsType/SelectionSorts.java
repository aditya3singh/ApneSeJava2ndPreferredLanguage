
class SelectionSorts {
    public static void SelectionSort(int nums[]){
        int n= nums.length;
        for(int turn= 0; turn< n- 1; turn++){
            int minPos = turn;
            for(int i= turn + 1; i< n-1; i++){
                if(nums[minPos] > nums[i]){
                    minPos = i;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[turn];
            nums[turn] = temp;
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
        SelectionSort(nums);
        printArr(nums);
    }
}

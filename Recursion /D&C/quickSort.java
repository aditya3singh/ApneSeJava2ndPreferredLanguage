public class Main{
    public static void quickSort(int arr[], int sl, int el){
        if(sl >= el) return;
        
        int pvt = partition(arr, sl, el);
        quickSort(arr, sl, pvt-1);
        quickSort(arr, pvt+1, el);
    } 
    
    public static int partition(int arr[], int sl, int el){
        int pivot = arr[el];
        int i = sl - 1;
        
        for(int j = sl; j<el; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[el]= arr[i];
        arr[i] = temp;
        return i;
        
    }
    
    public static void printArr(int arr[]){
        for(int i= 0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

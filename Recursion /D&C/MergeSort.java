// "static void main" must be defined in a public class.
public class MergeSort {
    public static void mergeSort(int arr[], int sl, int el){
        if(sl >= el) return;
        
        int mid = sl + (el - sl) / 2;
        mergeSort(arr, sl, mid);
        mergeSort(arr, mid + 1, el);
        merge(arr, sl, mid, el);
    }
    
    public static void merge(int[] arr, int sl, int mid , int el){
        int temp[] = new int[el - sl + 1];
        int i = sl;
        int j = mid + 1;
        int k = 0;
        
        while(i <= mid && j <= el){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //right part
        while( j<= el){
            temp[k++] = arr[j++];
        }
        //copy from the original array
        for( k= 0, i = sl; k< temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    
    public static void printArr(int arr[]){
        for(int i= 0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }   
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

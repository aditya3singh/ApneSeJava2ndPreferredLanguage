public class firstOcc {
    
    public static int firstOcc(int arr[], int key, int i){
        if(arr[i] == key) return i;
        
        i++;
        
        if((arr[i] != key) && (i == arr.length - 1)) return -1;
        
        return firstOcc(arr, key, i++);
    }
    public static void main(String[] args) {
        int arr[] = {2,6,1,5,8,3};
        int key =3;
        int i = 0;
        
        System.out.println(firstOcc(arr, key, i));
    }
}

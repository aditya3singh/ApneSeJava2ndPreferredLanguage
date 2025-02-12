// "static void main" must be defined in a public class.
public class lastO {
    
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length) return -1;
        
        int isFound = lastOcc(arr, key, i + 1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        } 
        
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,3,8,3};
        int key =3;
        int i = 0;
        
        System.out.println(lastOcc(arr, key, i));
    }
}

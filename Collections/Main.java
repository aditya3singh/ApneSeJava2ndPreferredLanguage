
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);//0
        list.add(3);//1
        list.add(80);//2
        System.out.println(list.get(2));//80
        System.out.println(list.size());//3

        for(int i= 0; i< list.size(); i++){
            System.out.println(list.get(i));//5 3 80
        }
        for(int x : list){
            System.out.println(x);//5 3 80
        }
        
        System.out.println(list.contains(50));//false
        System.out.println(list.contains(80));//true

        list.add(2, 50);//It will effectively clear the position indicated by the declared index for the next element.
        for(int x : list){
            System.out.println(x);//5 3 50 80
        }
        
        list.remove(2);//it will remove/ delete the 2nd place element which is 80 now
        System.out.println(list.contains(50));//false
        System.out.println(list.contains(80));//false
    }
}

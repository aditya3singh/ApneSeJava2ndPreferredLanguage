import java.util.*;

class Main {
    public int factorialFun(int n){
        if(n == 1 || n == 0) return 1;
        
        return n * factorialFun(n - 1);
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.factorialFun(n));
    }
}

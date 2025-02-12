// "static void main" must be defined in a public class.
public class Power {
    
    public static int power(int x, int n){
        if(n == 0) return 1;
        
        return  x * power(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x, n));
    }
}


// "static void main" must be defined in a public class.
public class Main {
    
    public static int Optimizedpower(int x, int n){
        if(n == 0) return 1;
        int callThis = Optimizedpower(x, n/2);
        int halfPower = callThis * callThis;
        
        if(n % 2 != 0){
            halfPower = x *  halfPower;
        }
        
        return  halfPower;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Optimizedpower(x, n));
    }
}

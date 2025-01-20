import java.util.Scanner;
class BinToDec {
    public static void BinToDecFn(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println(decNum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        Main m = new Main();
        BinToDecFn(binNum);
    }
}

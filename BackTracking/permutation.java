// "static void main" must be defined in a public class.
public class permutation {
    public static void permutation1(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i= 0; i< str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation1(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String str = "ABC";
        permutation1(str, "");
    }
}

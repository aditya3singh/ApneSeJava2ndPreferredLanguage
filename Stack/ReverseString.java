// "static void main" must be defined in a public class.
import java.util.*;

public class ReverseString {    
    public static String reverseStack(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String result = reverseStack("abcd");
        System.out.println(result);
    }
}

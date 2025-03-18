import java.util.* ;
import java.io.*; 

public class DuplicateParanthesis {

	public static boolean duplicateParanthesis(String expr) {
		// Write your code here
		Stack<Character> st = new Stack<>();
		for(int i= 0; i< expr.length(); i++){
			char ch = expr.charAt(i);
			if(ch == ')'){
				int count = 0;
				while(st.peek() != '('){
					st.pop();
					count++;
				}
				if(count < 1){
					return true;
				}else{
					st.pop();
				}
			}else{
				st.push(ch);
			}
		}
		return false;
	}

}

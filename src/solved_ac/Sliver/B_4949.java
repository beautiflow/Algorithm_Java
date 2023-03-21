package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            } else {
                System.out.println(answer(str));
            }
        }
    }

   private static String answer(String str){

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '(' || c == '['){
                stack.push(c);
            }
            else if (c == ')') {
                if(stack.isEmpty() || stack.peek() != '('){
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if( c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return "yes";
        }
        else {
            return "no";
        }
   }
}






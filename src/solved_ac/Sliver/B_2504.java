package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String command = br.readLine();
        int answer = 0;
        int tmp = 1;

        for(int i = 0; i < command.length(); i++){

            char c = command.charAt(i);

            if( c == '(' || c == '['){
                stack.push(c);
                tmp *= (c == '(') ? 2 : 3;
            }
            else{
                if(stack.isEmpty()){
                    answer = 0;
                    break;
                }
                else {
                    if(c == ')'){
                        if(stack.isEmpty() || stack.peek() != '('){
                            answer = 0;
                            break;
                        }
                        if(command.charAt(i-1) == '('){
                            answer += tmp;
                        }
                        stack.pop();
                        tmp /= 2;
                    }
                    else if (c == ']') {
                        if(stack.isEmpty() || stack.peek() != '['){
                            answer = 0;
                            break;
                        }
                        if(command.charAt(i-1) == '['){
                            answer += tmp;
                        }
                        stack.pop();
                        tmp /= 3;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            answer = 0;
        }
        System.out.println(answer);
    }
}

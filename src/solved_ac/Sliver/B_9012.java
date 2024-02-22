package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            // 괄호 담을 스택 생성
            Stack<Character> stack = new Stack<>();
            // 문자열 입력
            String str = br.readLine();
            // 문자열 돌면서 괄호 체크
            if(emptyStack(str, stack)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    } // main

    private static boolean emptyStack(String str, Stack<Character> stack) {

        for(int i = 0; i < str.length(); i++){
            // '(' 여는 괄호면 push
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            // ')' 닫는 괄호면 stack 위 체크하고 pop or push
            else {
                if(!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                }
                else {
                    stack.push(str.charAt(i));
                }
            }
        }

        // 스택이 비어있으면 true 반환, 그렇지 않으면 false 반환
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    } // emptyStack

}

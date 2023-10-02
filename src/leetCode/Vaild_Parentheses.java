package leetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Vaild_Parentheses {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String brackets = br.readLine();
        boolean result = isVaild(brackets);
        System.out.println(result);
    }

    public static boolean isVaild(String s) {
            if (s.length() % 2 == 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                switch (ch) {
                    case ')':
                        if (stack.empty() || stack.peek() != '(') {
                            return false;
                        }
                        else {stack.pop();}
                        break;
                    case '}':
                        if (stack.empty() || stack.peek() != '{') {
                            return false;
                        }
                        else {stack.pop();}
                        break;
                    case ']':
                        if (stack.empty() || stack.peek() != '[') {
                            return false;
                        }
                        else {stack.pop();}
                        break;
                }
            }
            return stack.empty();
        }
    }


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
        class Solution {
            public boolean isVaild(String s) {
                Stack<Character> st = new Stack<>();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (st.peek() == '(' && ch == ')') {
                        st.pop();
                    }
                    if (st.peek() == '{' && ch == '}') {
                        st.pop();
                    }
                    if (st.peek() == '[' && ch == ']') {
                        st.pop();
                    } else {
                        st.push(ch);
                    }
                }


            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

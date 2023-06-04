package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S_1234 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 1; tc <= 10; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<Character> stack = new Stack<>();

            int T = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";

            for(int i = 0; i < T; i++){
               char ex = str.charAt(i);

                if(stack.isEmpty() || ex != stack.peek()){
                    stack.push(ex);
                }
                else {
                    stack.pop();
                }
            }
            while (!stack.isEmpty()){
                result += stack.pop();
            }
            StringBuilder sb = new StringBuilder(result);
            System.out.println("#"+tc+" "+sb.reverse());
        }
    }
}

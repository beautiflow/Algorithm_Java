package solved_ac.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        long count = 0;

        for (int i = 1; i <= N; i++) {
            int top = Integer.parseInt(br.readLine());

            while (!stack.isEmpty() && stack.peek() <= top)  {
                stack.pop();
            }

            count += stack.size();
            stack.push(top);
        }

        System.out.println(count);
    }
}


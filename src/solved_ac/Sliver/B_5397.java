package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stackLeft = new Stack<>();
        Stack<Character> stackRight = new Stack<>();

        for (int tc = 1; tc <= N; tc++) {

            String[] str = br.readLine().split("");

            for (String password : str) {
                switch (password) {
                    case "<":
                        if (!stackLeft.isEmpty()) {
                            stackRight.push(stackLeft.pop());
                        }
                        break;
                    case ">":
                        if (!stackRight.isEmpty()) {
                            stackLeft.push(stackRight.pop());
                        }
                        break;
                    case "-":
                        if (!stackLeft.isEmpty()) {
                            stackLeft.pop();
                        }
                        break;
                    default:
                        stackLeft.push(password.charAt(0));
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();

            while (!stackLeft.isEmpty()) {
                stackRight.push(stackLeft.pop());
            }
            while (!stackRight.isEmpty()) {
                sb.append(stackRight.pop());
            }
            System.out.println(sb);
        }
    }
}


package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int N = Integer.parseInt(br.readLine());

        Stack<Character> stackLeft = new Stack<>();
        Stack<Character> stackRight = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stackLeft.push(str.charAt(i));
        }

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "L":
                    if (!stackLeft.isEmpty()) {
                        stackRight.push(stackLeft.pop());
                    }
                    break;
                case "D":
                    if (!stackRight.isEmpty()) {
                        stackLeft.push(stackRight.pop());
                    }
                    break;
                case "B":
                    if (!stackLeft.isEmpty()) {
                        stackLeft.pop();
                    }
                    break;
                case "P":
                    char character = st.nextToken().charAt(0);
                    stackLeft.push(character);
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

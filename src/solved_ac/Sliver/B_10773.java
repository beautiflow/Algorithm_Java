package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        for (int tc = 1; tc <= T; tc++) {

            int num = Integer.parseInt(br.readLine());
            st.push(num);

            if (num == 0) {
                st.pop();
                st.pop();
            }
        }
        int result = 0;

        for (int k : st) {
            result += k;
        }
        System.out.println(result);
    }
}


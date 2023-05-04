package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            str = str.toLowerCase();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                    count++;
                }

            }
            if (count == str.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

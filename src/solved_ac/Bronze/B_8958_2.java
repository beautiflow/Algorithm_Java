package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_8958_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int total = 0;

            String line = br.readLine();
            int count = 0;

            char[] quiz = new char[line.length()];

            for (int i = 0; i < line.length(); i++) {
                quiz[i] = line.charAt(i);
                if (quiz[i] == 'O') {
                    count += 1;
                    total += count;

                } else if (quiz[i] == 'X') {
                    count = 0;
                }
            }
            System.out.println(total);

        }

    }
}

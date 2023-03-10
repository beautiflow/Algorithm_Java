package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (GroupWord()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean GroupWord() throws IOException {
        boolean[] alphabetArr = new boolean[26];
        int prevAlphabet = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != prevAlphabet) {
                if (!alphabetArr[ch - 'a']) {
                    alphabetArr[ch - 'a'] = true;
                    prevAlphabet = ch;
                } else {
                    return false;
                }
            } else {
                continue;

            }

        }
        return true;
    }
}

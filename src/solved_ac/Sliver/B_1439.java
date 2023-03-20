package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer str1 = new StringTokenizer(str, "0");
        StringTokenizer str2 = new StringTokenizer(str, "1");

        System.out.println(Math.min(str1.countTokens(), str2.countTokens()));
    }
}

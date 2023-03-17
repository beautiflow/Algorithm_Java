package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuffer sbf = new StringBuffer(A);
        StringBuffer sbf2 = new StringBuffer(B);

        String reverseA = sbf.reverse().toString();
        String reverseB = sbf2.reverse().toString();

        int resultA = Integer.parseInt(reverseA);
        int resultB = Integer.parseInt(reverseB);

        int total = resultA + resultB;

        String last = String.valueOf(total);

        StringBuffer sbf3 = new StringBuffer(last);
        String reverselast = sbf3.reverse().toString();


        System.out.println(Integer.parseInt(reverselast));

    }
}

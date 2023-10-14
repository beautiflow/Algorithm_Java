package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_3985_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int L = Integer.parseInt(br.readLine()); // 길이
        int N = Integer.parseInt(br.readLine()); // 명
        int[] lolCake = new int[L+1];
        int expected = 0; // 가장 많이 받을 케익 수
        int now = 0; // 현재 많이 받을 케익 수
        int current = 0; // 많이 받을 것이라 예상되는 번째 수

        int maxSum = Integer.MIN_VALUE; // 실제 받는 케익 수
        int realMax = 0;


        for (int i = 0; i < L; i++) {
            lolCake[i] = 0;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;


            expected = Math.max(expected, K - P + 1);
            if (now != expected) {
                now = expected;
                current = i;
            }

            for (int j = P; j <= K; j++) {
                if (lolCake[j] == 0) {
                    lolCake[j] = i;
                    count++;
                }
            }
            if (count > maxSum) {
                realMax = i;
                maxSum = count;
            }
        }
        System.out.println(current);
        System.out.println(realMax);
    }

}


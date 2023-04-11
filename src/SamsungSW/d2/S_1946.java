package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int count = 0;

            sb.append('#').append(tc).append('\n');
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                String word = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                for (int i = 0; i < num; i++) {
                    sb.append(word);
                    count++;
                    if (count >= 10) {
                        sb.append('\n');
                        count = 0;
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

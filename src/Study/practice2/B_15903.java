package Study.practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15903 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] card = new long[N];
        String[] change = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            card[i] = Long.parseLong(change[i]);
        }

        for(int i = 0; i < M; i++){
            Arrays.sort(card);
            long sum = card[0] + card[1];
            card[0] = sum;
            card[1] = sum;
        }

        long answer = 0;

        for(int i = 0; i < N; i++){
            answer += card[i];
        }

        System.out.println(answer);


    }
}

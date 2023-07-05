package Study.practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] P = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);
        int sum = 0;
        int wait = 0;

        for(int i = 0 ; i < N; i++){
            sum += wait + P[i];
            wait += P[i];
        }
        System.out.println(sum);
    }
}

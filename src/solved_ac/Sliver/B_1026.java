package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[T];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < T; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        Integer[] B = new Integer[T];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < T; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(B, Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0 ; i < T; i++){
            sum += A[i] * B[i];
        }
        System.out.println(sum);
    }
}

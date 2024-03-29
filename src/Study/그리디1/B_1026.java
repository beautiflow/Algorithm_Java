package Study.그리디1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i]*B[N-i-1];
        }
        System.out.println(sum);
    }
}

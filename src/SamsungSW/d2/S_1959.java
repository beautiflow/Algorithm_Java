package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine()," ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0; i < N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0; i < M; i++){
                B[i] = Integer.parseInt(st.nextToken());
            }

            int Max = 0;

            if(N < M){
                for(int i = 0; i < M-N+1; i++){
                    int result = 0;
                    for(int j = 0; j < N; j++){
                        result += A[j] * B[i+j];
                    }
                    Max = Math.max(Max, result);
                }
            }
            if(N > M){
                for(int i = 0; i < N-M+1; i++){
                    int result = 0;
                    for(int j = 0; j < M; j++){
                        result += A[i+j] * B[j];
                    }
                    Max = Math.max(Max, result);
                }
            }
            else {
                int result = 0;

                for(int a = 0; a < N; a++){
                    result += A[a] * B[a];
                }
                Max = Math.max(Max, result);
            }
            System.out.println("#"+tc+" "+Max);

        }
    }
}

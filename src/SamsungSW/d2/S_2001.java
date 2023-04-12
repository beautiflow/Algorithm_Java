package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2001 {
    static int N;
    static int M;
    static int result;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine(), " ");
             N = Integer.parseInt(st.nextToken());
             M = Integer.parseInt(st.nextToken());

            board = new int[N][N];

            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine()," ");
                for(int j = 0; j < N; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            result = 0;

            for(int i = 0; i <= N-M; i++){
                for(int j = 0; j <= N-M; j++){
                    clap(i, j);

                }
            }
            System.out.print("#"+tc+" ");
            System.out.println(result);
        }
    }

    public static void clap(int x, int y) {
        int sum = 0;
        for(int i = x; i < x+M; i++){
            for(int j = y; j < y+M; j++){
                sum += board[i][j];
            }
        }
        if(result < sum){
            result = sum;
        }
    }
}

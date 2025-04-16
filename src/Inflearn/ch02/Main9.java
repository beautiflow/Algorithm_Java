package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j < N; j++){
                sum1 += board[i][j];
                sum2 += board[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);

        }

        int sum3 = 0;
        int sum4 = 0;
        for(int i = 0; i < N; i++){
            sum3 += board[i][i];
            sum4 += board[i][N-i-1];
        }

        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);

        System.out.println(answer);

    }
}

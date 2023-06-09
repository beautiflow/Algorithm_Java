package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_11315 {

    static int N;
    static char[][] board;
    static int count;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            board = new char[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    board[i][j] = str.charAt(j);
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    rowCheck();
                    colCheck();
                    leftCheck();
                    rightCheck();
                }
            }
            System.out.print("#" + tc + " ");
            if (cnt >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            cnt = 0;
        }
    }

    private static void rowCheck() {
        for (int i = 0; i < N; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'o') {
                    count++;
                }
            }
            if (count == 5) {
                cnt++;
            }
        }
    }

    private static void colCheck() {
        for (int i = 0; i < N; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                if (board[j][i] == 'o') {
                    count++;
                }
            }
            if (count == 5) {
                cnt++;
            }
        }
    }

    private static void leftCheck() {
        count = 0;
        for (int i = 0; i < N-5; i++) {
            for(int j = 0; j < N-5; j++) {
                if (board[i][j] == 'o') {
                    count++;
                }
            }
        }
        if (count == 5) {
            cnt++;
        }
    }

    private static void rightCheck() {
        count = 0;
        for (int i = 0; i < N; i++) {
            if (board[i][N-i-1] == 'o') {
                count++;
            }
        }
        if (count == 5) {
            cnt++;
        }
    }
}

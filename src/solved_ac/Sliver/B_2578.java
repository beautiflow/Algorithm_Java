package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2578 {
    static int[][] board;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        board = new int[5][5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
//                System.out.println("board = " + board[i][j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
//                System.out.println("num = " + num);
                total++;

                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (board[k][l] == num) {
                            board[k][l] = 0;

                            rowCheck();
                            colCheck();
                            leftCheck();
                            rightCheck();
                        }
                    }
                }
                if (count >= 3) {
                    System.out.println(/*"total = "+*/total);
                    System.exit(0);
                }
                count = 0;
            }
        }

    }


    public static void rowCheck() {
        for (int i = 0; i < 5; i++) {
            int box = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    box++;
                }
            }
            if (box == 5) {
                count++;
            }
        }
    }

    public static void colCheck() {
        for (int i = 0; i < 5; i++) {
            int box = 0;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == 0) {
                    box++;
                }
            }
            if (box == 5) {
                count++;
            }
        }
    }

    public static void leftCheck() {
        int box = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 0) {
                box++;
            }
            if (box == 5) {
                count++;
            }
        }
    }


    public static void rightCheck() {
        int box = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] == 0) {
                box++;
            }
            if (box == 5) {
                count++;
            }
        }
    }
}


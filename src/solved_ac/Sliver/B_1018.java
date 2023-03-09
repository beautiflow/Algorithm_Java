package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1018 {

    private static final boolean[][] WHITE = {
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
    };

    private static final boolean[][] BLACK = {
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
            {false, true, false, true, false, true, false, true},
            {true, false, true, false, true, false, true, false},
    };

    private static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

       board = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split("");

            for(int j = 0; j < M; j++){
                board[i][j] = line[j].equals("W");
            }
        }

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                int count = solve(i, j);
                if(result > count){
                    result = count;
                }
            }
        }
        System.out.println(result);
    }

    private static int solve(int x, int y){

        int white = 0;
        int black = 0;

        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                if(board[i][j] != WHITE[i - x][j - y]){
                    white++;
                }
                if(board[i][j] != BLACK[i - x][j - y]){
                    black++;
                }
            }
        }
        return Math.min(white, black);
    }
}


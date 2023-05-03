package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1913 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] snail = new int[N][N];

        int move = 0;
        int x = 0;
        int y = 0;
        int locateX = 0;
        int locateY = 0;

        for (int i = N * N; i > 0; i--) {
            snail[x][y] = i;
            if (x + dx[move] >= N || x + dx[move] < 0 || y + dy[move] >= N || y + dy[move] < 0 || snail[x + dx[move]][y + dy[move]] != 0) {
                move = (move + 1) % 4;
            }
            x += dx[move];
            y += dy[move];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(snail[i][j]).append(" ");
                if (snail[i][j] == num) {
                    locateX = i + 1;
                    locateY = j + 1;
                }
            }
            sb.append('\n');
        }
        sb.append(locateX + " " + locateY);
        System.out.println(sb);
    }
}

package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1952 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] snail = new int[M][N];

        int move = 0;
        int x = 0;
        int y = 0;
        int count = 0;

        for (int i = 1; i <= M * N; i++) {
            snail[x][y] = i;
            if (x + dx[move] >= M || x + dx[move] < 0 || y + dy[move] >= N || y + dy[move] < 0 || snail[x + dx[move]][y + dy[move]] != 0) {
                move = (move + 1) % 4;
                count++;
            }
            x += dx[move];
            y += dy[move];
        }
        System.out.println(count-1);

    }
}

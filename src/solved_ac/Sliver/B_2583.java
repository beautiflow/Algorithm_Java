package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class B_2583 {
    static int n;
    static int m;
    static int k;
    static int count;
    static int[][] map;
    static ArrayList<Integer> List;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        List = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int a = y1; a < y2; a++) {
                for (int b = x1; b < x2; b++) {
                    map[a][b] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    count = 0;
                    bfs(i, j);
                    List.add(count);
                }
            }
        }
        System.out.println(List.size());
        Collections.sort(List);
        for (Integer c : List) {
            System.out.print(c + " ");
        }
    }

    public static void bfs(int x, int y) {
        map[x][y] = 1;
        count++;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};


        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (map[nx][ny] == 0) {
                    bfs(nx, ny);
                }
            }
        }
    }
}



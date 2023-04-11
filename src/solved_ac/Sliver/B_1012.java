package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1012 {
    static int n;
    static int m;
    static int k;
    static int area;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());


        for(int tc = 1; tc <= T; tc++){
            area = 0;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            visited = new boolean[n][m];

            k = Integer.parseInt(st.nextToken());
            for(int i = 0; i < k; i++){
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                map[p1][p2] = 1;
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        bfs(i, j);
                    }
                }
            }
            System.out.println(area);
        }
    }

    public static void bfs(int x, int y){
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x, y));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        while (!que.isEmpty()){
            Point point = que.poll();

            for(int d = 0; d < 4; d++){
                int nx = point.x + dx[d];
                int ny = point.y + dy[d];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m ){
                    continue;
                }
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    que.add(new Point(nx, ny));
                }
            }
        }
        area++;
    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_2178 {

    static int n;
    static int m;
    static int[][] distance;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        distance = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            char[] ch = str.toCharArray();
            for(int j = 0; j < ch.length; j++){
                distance[i][j] = Character.getNumericValue(ch[j]);
            }
        }

        visited[0][0] = true;
        bfs(0,0);

        System.out.println(distance[n-1][m-1]);
    }

    public static void bfs(int x, int y){
        Queue<Mirro> que = new LinkedList<>();
        que.add(new Mirro(x, y));

        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        while (!que.isEmpty()){
            Mirro mirro = que.poll();

            for(int d = 0; d < 4; d++){
                int nx = mirro.x + dx[d];
                int ny = mirro.y + dy[d];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                if(visited[nx][ny] || distance[nx][ny] == 0){
                    continue;
                }

                    que.add(new Mirro(nx, ny));
                    distance[nx][ny] = distance[mirro.x][mirro.y]+1;
                    visited[nx][ny] = true;

                }
            }
        }
    }

class Mirro{
    int x;
    int y;

    public Mirro(int x, int y){
        this.x = x;
        this.y = y;
    }
}

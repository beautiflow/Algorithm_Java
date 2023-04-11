package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_2667 {
    static int n;
    static int count;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> List;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        List = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            char[] ch = line.toCharArray();
            for(int j = 0; j < n; j++){
                map[i][j] = Character.getNumericValue(ch[j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    count = 0;
                    bfs(i, j);
                    List.add(count);
                }
            }
        }
        System.out.println(List.size());
        Collections.sort(List);
        for(Integer t : List){
            System.out.println(t);
        }
    }

    public static void bfs(int x, int y){
        Queue<House> que = new LinkedList<>();
        que.add(new House(x, y));
        visited[x][y] = true;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        while (!que.isEmpty()){
            House house = que.poll();

            count++;

            for(int d = 0; d < 4; d++){
                int nx = house.x + dx[d];
                int ny = house.y + dy[d];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                    continue;
                }
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    que.add(new House(nx, ny));
                }
            }
        }
    }
}

class House {
    int x;
    int y;

    public House(int x, int y){
        this.x = x;
        this.y = y;
    }
}

package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  S_1954 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());
            int[][] nums = new int[N][N];

            int move = 0; // 현재 방향 인덱스
            int r = 0; // 시작 좌표
            int c = 0; // 시작 좌표
            for(int i = 1; i <= N*N; i++){
                nums[r][c] = i;
                if(r + dx[move] >= N || r + dy[move] < 0 || c + dy[move] >= N || c + dy[move] < 0 || nums[r + dx[move]][c + dy[move]] != 0){

                    move = (move + 1) % 4;
                }
                r += dx[move];
                c += dy[move];
            }


            System.out.println("#" + tc);
            for(int i = 0; i < N; i++){
                for(int n : nums[i]){
                    System.out.print(n + " ");
                }
                System.out.println();
            }
        }
    }
}

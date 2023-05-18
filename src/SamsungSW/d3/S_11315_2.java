package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_11315_2 {

    static int[] dx = {0, 1, 1, 1}; // 오른쪽, 아래 왼쪽, 아래 , 아래 오른쪽
    static int[] dy = {1, -1, 0, 1};
    static char[][] board;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            N = Integer.parseInt(br.readLine());
            String answer = "NO";

            board = new char[N][N];

            for(int i = 0; i < N; i++){
                String str = br.readLine();
                for(int j = 0; j < N; j++){
                    board[i][j] = str.charAt(j);
                }
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(board[i][j] == 'o'){
                        for(int dir = 0; dir < 4; dir++){
                            int cnt = counting(i, j, dir);
                            if(cnt == 5){
                                answer = "YES";
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("#"+tc+" "+answer);
        }
    }

    private static int counting(int i, int j, int dir) {
        int cnt = 1;
        int dirX = i;
        int dirY = j;
        for(int k = 0; k < 4; k++){
            dirX = dirX + dx[dir];
            dirY = dirY + dy[dir];
            if(dirX >= 0 && dirX < N && dirY >= 0 && dirY < N && board[dirX][dirY] == 'o'){
                cnt++;
            }
            else {
                break;
            }
        }
        return cnt;
    }

//    static char[][] map;
//    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
//    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
//    static boolean check;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//
//        for (int tc = 1; tc <= T; tc++) {
//           int N = Integer.parseInt(br.readLine());
//
//            map = new char[N][N];
//
//            for (int i = 0; i < N; i++) {
//                String str = br.readLine();
//                for (int j = 0; j < N; j++) {
//                    map[i][j] = str.charAt(j);
//                }
//            }
//
//            check = false;
//
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    if (map[i][j] == 'o') {
//                        for (int a = 0; a < 8; a++) {
//                            for (int count = 1; count < 5; count++) {
//                                int x = i + dx[a] * count;
//                                int y = i + dy[a] * count;
//
//                                if (x < 0 || y < 0 || x >= N || y >= N) {
//                                    break;
//                                } else if (map[x][y] != 'o') {
//                                    break;
//                                }
//                                if (count == 4) {
//                                    check = true;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            if (check) {
//                System.out.println("#" + tc + " " + "YES");
//            }
//            else {
//                System.out.println("#" + tc + " " + "NO");
//            }
//        }
//    }
}


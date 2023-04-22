package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1979 {
    static int N;
    static int K;
    static int count;
    static int total;
    static int[][] puzzle;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            puzzle = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            count = 0;
            total = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (puzzle[i][j] == 1) {
                        count++;
                    } else if (count >= 1 && puzzle[i][j] == 0) {
                        if (count == K) {
                            total++;
                        }
                        count = 0;
                    }
                }
                if (count == K) {
                    total++;
                }
                count = 0;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (puzzle[j][i] == 1) {
                        count++;
                    } else if (count >= 1 && puzzle[j][i] == 0) {
                        if (count == K) {
                            total++;
                        }
                        count = 0;
                    }
                }
                if (count == K) {
                    total++;
                }
                count = 0;
            }
            System.out.println("#" + tc + " " + total);
        }
    }
}

//            for(int i = 0; i <= N-K; i++ ){
//                for(int j = 0; j <= N-K; j++){
//                    row(i,j);
//                    col(i,j);
//                }
//            }
//        }
//    }
//
//    private static int row(int x, int y) {
//        // 가로 맞는 부분 찾기
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N - K; j++) {
//                if (puzzle[i][j].equals("1")) {
//                    count++;
//                }
//                if(count == 3){
//                    cnt++;
//                    count = 0;
//                }
//            }
//        }
//        return cnt;
//    }
//
//    private static int col(int x, int y) {
//        for(int i = 0; i < N - K; i++){
//            for(int j = 0; j < N; j++){
//                if(puzzle[j][i].equals("1")){
//                    count++;
//                }
//                if(count == 3){
//                    cnt++;
//                    count = 0;
//                }
//            }
//        }
//        return cnt;
//    }
//}

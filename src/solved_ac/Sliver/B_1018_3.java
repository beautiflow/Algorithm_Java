package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1018_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로

        // 입력될 보드판 생성
        String[][] inputBoard = new String[N+1][M+1];

        // 보드판 입력받기
        for(int i = 1; i <= N; i++){
            String[] str = br.readLine().split("");
            for(int j = 1; j <= M; j++){
                inputBoard[i][j] = str[j-1];
            }
        }

        int minCount = Integer.MAX_VALUE;

        for(int i = 1; i <= N - 7; i++) {
            for (int j = 1; j <= M - 7; j++) {
                // 보드판 돌면서 색 확인하기
               int count  = startCount(inputBoard, i, j);
                minCount = Math.min(minCount, count);
            }
        }
        // 결과 출력
        System.out.println(minCount);
    }

    private static int startCount(String[][] inputBoard, int x, int y) {
        // B 먼저 시작하는 보드판 확인하기
        int cntB = 0;
        for(int i = x; i < x+8; i++){
            for(int j = y; j < y+8; j++){
                if((i+j) % 2 == 0) {
                    if (!"B".equals(inputBoard[i][j])) {
                        cntB++;
                    }
                }
                else {
                    if (!"W".equals(inputBoard[i][j])) {
                        cntB++;
                    }
                }
            }
        }

        // W 먼저 시작하는 보드판 확인하기
        int cntW = 0;
        for(int i = x; i < x+8; i++){
            for(int j = y; j < y+8; j++){
                if((i+j) % 2 == 0) {
                    if (!"W".equals(inputBoard[i][j])) {
                        cntW++;
                    }
                }
                else {
                    if (!"B".equals(inputBoard[i][j])) {
                        cntW++;
                    }
                }
            }
        }

        // cntB 랑 cntW 비교해서 최솟값 구하기
        int min = Math.min(cntW, cntB);

        return min;
    }
}

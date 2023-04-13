package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[][] square = new int[1001][1001];

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int a = x1; a < x1+x2; a++){
                for(int b = y1; b < y1+y2; b++){
                    square[a][b] = tc;
                }
            }
        }
        for(int tc =1; tc <= T; tc++){
            int count = 0;
            for(int i = 0; i < 1001; i++){
                for(int j = 0; j < 1001; j++){
                    if(square[i][j] == tc){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

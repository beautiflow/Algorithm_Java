package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] black = new int[101][101];


        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int x = a; x < a+10; x++){
                for(int y = b; y < b+10; y++){
                    black[x][y] = 1;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(black[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

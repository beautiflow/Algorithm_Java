package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2563_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] square = new int[101][101];

        for(int tc = 0; tc < N; tc++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int x = a; x < a+10; x++){
                for(int y = b; y < b+10; y++){
                    square[x][y] = 1;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square.length; j++){
                if(square[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println("cnt = " + cnt);
    }
}

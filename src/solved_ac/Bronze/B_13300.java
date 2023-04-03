package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13300 {

    static int N;
    static int K;
    static int[][] room;
    static int s;
    static int grade;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        room = new int[2][7];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken());
            room[s][grade]++;
        }
        int count = 0;

        for(int i = 0 ; i < 2; i++){
            for(int j = 1; j < 7; j++){
                count += room[i][j] / K;
                if(room[i][j] % K != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

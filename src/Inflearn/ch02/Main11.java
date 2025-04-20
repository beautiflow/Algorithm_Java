package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] classes = new int[N+1][6];

        for(int i = 1 ; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=5; j++){
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= N; i++){
            int cnt = 0;
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= 5; k++){
                   if(classes[i][k] == classes[j][k]){
                       cnt++;
                       break;
                   }
                }
            }
            if(max < cnt){
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer);

    }
}

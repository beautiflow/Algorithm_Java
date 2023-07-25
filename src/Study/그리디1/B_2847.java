package Study.그리디1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2847 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];

        for(int i = 0 ; i < score.length; i++){
            score[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;

        for(int i = N-1; i > 0; i--){
            while (score[i] <= score[i-1]){
                count++;
                score[i-1] = score[i-1]-1;
            }
        }
        System.out.println(count);
    }
}

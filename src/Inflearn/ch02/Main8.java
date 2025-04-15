package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        for(int i = 0; i < N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[N];

        for(int i = 0 ; i < score.length; i++){
            int cnt = 1;
            for(int j = 0; j < score.length; j++){
                if(score[j] > score[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

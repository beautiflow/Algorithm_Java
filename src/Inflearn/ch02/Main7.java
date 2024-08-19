package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] testResult = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            testResult[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int total = 0;
        for(int i = 0; i < testResult.length; i++){
            if(testResult[i] == 1){
                cnt += 1;
                total += cnt;
            } else {
                cnt = 0;
            }
        }

        System.out.println(total);
    }
}

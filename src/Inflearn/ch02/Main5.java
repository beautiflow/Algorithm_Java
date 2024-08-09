package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[N+1];
        int count = 0;

        for(int i = 2; i <=N; i++){
            isPrime[i] = true;
        }

        for(int i = 2 ; i <= Math.sqrt(N); i++){
            if(isPrime[i]) {
                for(int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= N; i++){
            if(isPrime[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}

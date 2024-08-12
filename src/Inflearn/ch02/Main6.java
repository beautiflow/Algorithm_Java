package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        ArrayList<Integer> answer = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            int num = arr[i];
            int reverseNum = 0;

            while (num > 0){
                reverseNum = reverseNum * 10 + num % 10;
                num /= 10;
            }

            boolean isPrime = true;
            if (reverseNum < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(reverseNum); j++) {
                    if (reverseNum % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                answer.add(reverseNum);
            }

        }

        for(int i = 0 ; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }
}

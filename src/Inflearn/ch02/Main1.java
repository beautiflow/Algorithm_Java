package Inflearn.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String answer  = "";

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer += String.valueOf(arr[0]) + " ";

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                answer += String.valueOf(arr[i]) + " ";
            }
        }

        System.out.printf(answer);

    }
}

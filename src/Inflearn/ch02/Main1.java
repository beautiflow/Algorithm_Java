package Inflearn.ch02;

//1. 큰 수 출력하기
//   N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//  (첫 번째 수는 무조건 출력한다)
//
//  입력
//  첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//
//  출력
//  자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
//
//  예시 입력
//   6
//   7 3 9 5 6 12
//   예시 출력
//   7 9 6 12

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

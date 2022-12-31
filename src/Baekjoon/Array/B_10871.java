package Baekjoon.Array;

import java.util.Scanner;

public class B_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(arr[i] < M){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

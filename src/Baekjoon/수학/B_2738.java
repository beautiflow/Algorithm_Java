package Baekjoon.수학;

import java.util.Scanner;

/////REPLAY
public class B_2738 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][M];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    for (int j2 = 0; j2 < M; j2++) {
                        arr[j][j2] += sc.nextInt();
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


package Baekjoon.Array;

import java.util.Arrays;
import java.util.Scanner;

public class B_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[31];

        for(int i = 0; i < 28; i++){
            int N = sc.nextInt();
            arr[N] = true;
        }
        for(int i = 1; i <= 30 ; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}

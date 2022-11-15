package Baekjoon.For_While;

import java.util.Scanner;

public class B_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i<=N ; i++){
            for(int j = 1 ; j <= N - i ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//for(int i=1; i<=T; i++){
//        for(int j=1; j<=i; j++){
//        System.out.print("*");
//        }
//
//        System.out.print("\n");
//        }

package Baekjoon.For_While;

import java.util.Scanner;

public class B_8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for(int i = 0; i<=n ;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

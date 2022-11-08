package Baekjoon.If;

import java.util.Scanner;

public class B_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();

        int M = 60 * A + B;
        M += C;

        int hour = (M / 60) % 24;
        int minute = M % 60;

        System.out.println(hour + " " + minute);
    }
}

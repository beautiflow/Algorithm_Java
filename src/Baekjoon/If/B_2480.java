package Baekjoon.If;

import java.util.Scanner;

public class B_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();


        if (A == B && A == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B || A == C) {
            System.out.println(1000 + A * 100);
        } else if(B == C) {
            System.out.println(1000 + B * 100);
        } else {

            if (A != B && B != C && A != C) {

                int max;

                if (A > B) {
                    if (C > A) {
                        max = C;
                    }else {
                        max = A;
                    }
                } else {
                    if (C > B) {
                        max = C;
                    } else {
                        max = B;
                    }
                } System.out.println(max * 100);
            }
        }
    }
}


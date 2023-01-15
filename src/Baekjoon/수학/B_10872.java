package Baekjoon.수학;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class B_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = 1;

        while(N != 0){
            sum = sum * N;
            N--;
        }
        System.out.println(sum);
    }
}

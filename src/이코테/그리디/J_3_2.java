package 이코테.그리디;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J_3_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] num = new int[N];

        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int first = num[N - 1];
        int second = num[N - 2];

        int count = (M / (K + 1)) * K;
        count += M % (K + 1);

        int result = 0;
        result += (count) * first;
        result += (M - count) * second;

        System.out.println(result);

    }
}

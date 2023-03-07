package 이코테.그리디;

import java.io.IOException;
import java.util.Scanner;

public class J_3_3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int min_value = 10001;
            for (int j = 0; j < M; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            result = Math.max(result, min_value);
        }
        System.out.println(result);
    }
}


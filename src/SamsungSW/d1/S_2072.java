package SamsungSW.d1;

import java.io.IOException;
import java.util.Scanner;

public class S_2072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
             int arr;
             int sum=0;
            for (int j = 1; j <= 10; j++) {
                arr = sc.nextInt();
                if (arr % 2 != 0) {
                    sum += arr;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}


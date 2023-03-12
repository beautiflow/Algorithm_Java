package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;

            while (true) {
                if (N % 2 == 0) {
                    N = N / 2;
                    a++;
                } else if (N % 3 == 0) {
                    N = N / 3;
                    b++;
                } else if (N % 5 == 0) {
                    N = N / 5;
                    c++;
                } else if (N % 7 == 0) {
                    N = N / 7;
                    d++;
                } else if (N % 11 == 0) {
                    N = N / 11;
                    e++;
                }
                if (N == 1) {
                    break;
                }

            }
            System.out.println("#" + (i + 1) + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}

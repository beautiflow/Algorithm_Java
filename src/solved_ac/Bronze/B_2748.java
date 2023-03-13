package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2748 {

    static int n;
    static long k[] = new long[91];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         n = Integer.parseInt(br.readLine());

        k[0] = 0;
        k[1] = 1;

        for (int i = 2; i <= n; i++){
            k[i] = k[i-1]+k[i-2];
        }
        System.out.println(k[n]);
    }
}

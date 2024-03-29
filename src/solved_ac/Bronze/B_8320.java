package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_8320 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println("1");
            System.exit(0);
        }
        int cnt = 0;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i; j <= n; j++) {
                if (i * j <= n) cnt++;
            }
        }
        System.out.println(cnt);
    }
}

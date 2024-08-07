package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        System.out.println(tileSqure(N));
    }

    // 타일링 개수 세기
    private static int tileSqure(int n) {
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + (dp[i-2]*2))%10007;
        }
        return dp[n];
    }
}

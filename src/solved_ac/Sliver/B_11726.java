package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_11726 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = f(N);
        System.out.println(result);
    }

    public static int f(int n){
        int[] fibo = new int[1001];
        fibo[1] = 1;
        fibo[2] = 2;

        for(int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2])%10007;
        }
        return fibo[n]%10007;
    }
}

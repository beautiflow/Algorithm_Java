package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 0){
            System.out.println(0);
        }
        else if(N == 1){
            System.out.println(1);
        }
        else{
            BigInteger[] fibo = new BigInteger[N+1];

            fibo[0] = BigInteger.ZERO;
            fibo[1] = BigInteger.ONE;

            if(N > 1){
                for(int i = 2; i <= N; i++){
                    fibo[i] = fibo[i-1].add(fibo[i-2]);
                }
            }
            System.out.println(fibo[N]);
        }

    }
}

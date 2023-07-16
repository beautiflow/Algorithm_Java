package Study.practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_24266 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());

        BigInteger multi = N.multiply(N);
        BigInteger total = multi.multiply(N);

        System.out.println(total);
        System.out.println(3);
    }
}

package Study.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_24264 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger ret = N.multiply(N);
        System.out.println(ret);
        System.out.println(2);
    }
}

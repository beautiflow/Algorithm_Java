package solved_ac.Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class B_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("0");
        BigInteger C = new BigInteger("0");

        BigInteger sum = new BigInteger("0");

         A = sc.nextBigInteger();
         B = sc.nextBigInteger();
         C = sc.nextBigInteger();

        sum = sum.add(A);
        sum = sum.add(B);
        sum = sum.add(C);

        System.out.println(sum);
    }
}

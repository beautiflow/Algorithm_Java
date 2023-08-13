package CodeTree.Algorithm.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IsPrime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if(a==1 || b ==1){
                continue;
            }
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num) {
        boolean check = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return check;
    }
}

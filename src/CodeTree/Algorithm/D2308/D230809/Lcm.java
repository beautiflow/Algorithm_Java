package CodeTree.Algorithm.D2308.D230809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lcm {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int lcm = num1*num2/gcd(num1, num2);

        System.out.println(lcm);
    }

    public static int gcd(int num1, int num2){
        if(num1%num2 == 0){
            return num2;
        }

        return gcd(num2, num1%num2);
    }

}

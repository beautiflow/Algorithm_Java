package CodeTree.Algorithm.D2308.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsReturn2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        System.out.println(f(x));
    }

    public static int f(int x) {
        int cnt = 0;
        while (x % 2 == 0) {
            x /= 2;
            cnt++;
        }
        return cnt;
    }

}


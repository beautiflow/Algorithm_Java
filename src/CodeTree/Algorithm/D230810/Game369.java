package CodeTree.Algorithm.D230810;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game369 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (numberCheck(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean numberCheck(int num) {

        return (num % 3 == 0) || contain(num);
    }

    public static boolean contain(int num) {
        while (num > 0) {
            if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}

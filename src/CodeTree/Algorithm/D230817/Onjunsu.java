package CodeTree.Algorithm.D230817;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Onjunsu {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (onjunCheck(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean onjunCheck(int i) {
        if (i % 2 == 0) {
            return false;
        }
        else if (i % 10 == 5) {
            return false;
        }
        else if (i % 3 == 0 && i % 9 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}

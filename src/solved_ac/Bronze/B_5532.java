package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int koreanWork = A / C;
        int mathWork = B / D;

        if (A % C != 0) {
            koreanWork++;
        }
        if (B % D != 0) {
            mathWork++;
        }

        int M = Math.max(koreanWork, mathWork);

        System.out.println(L - M);
    }
}

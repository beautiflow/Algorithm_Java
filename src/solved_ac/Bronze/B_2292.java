package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int line = 1;
        int room = 2;

        if (N == 1) {
            System.out.print(1);
        } else {
            while (room <= N) {
                room = room + (6 * line);
                line++;
            }
            System.out.print(line);
        }
    }
}


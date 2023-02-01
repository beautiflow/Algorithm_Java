package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        int sum = 0;
        int min = 100;
        boolean b = false;

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 == 1) {
                b = true;
                sum += arr[i];
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        if (!b) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

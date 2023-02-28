package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = 1000 - Integer.parseInt(br.readLine());

        int[] coin = {500, 100, 50, 10, 5, 1};

        int count = 0;
        int i = 0;

        while (price != 0) {
            if (price - coin[i] >= 0) {
                price -= coin[i];
                count++;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}

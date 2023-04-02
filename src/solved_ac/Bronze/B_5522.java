package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i = 1; i <= 5; i++){
            int A = Integer.parseInt(br.readLine());

            sum += A;

        }
        System.out.println(sum);
    }
}

package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double d1 = Integer.parseInt(br.readLine());
        double d2 = Integer.parseInt(br.readLine());

        double row = d1 * 2;
        double circle = 2 * 3.141592 * d2;

        double playground = row + circle;
        System.out.println(playground);
    }
}

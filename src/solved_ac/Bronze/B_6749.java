package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_6749 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int third = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        int gap = second - third;

        int first = second + gap;

        System.out.println(first);
    }
}
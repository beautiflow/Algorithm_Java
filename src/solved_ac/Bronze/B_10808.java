package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[26];

        String input = br.readLine();

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            count[c -97]++;
        }
        for(int i = 0; i < 26; i++){
            System.out.print(count[i] + " ");
        }
    }
}

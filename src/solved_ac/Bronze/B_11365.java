package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_11365 {

    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            str = br.readLine();

            if (str.equals("END")) {
                break;
            }
            char[] arr = new char[500];

            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}

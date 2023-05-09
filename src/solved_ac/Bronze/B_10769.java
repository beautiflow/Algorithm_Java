package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int happy = 0, sad = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == ')') happy += 1;
            else if (str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == '(') sad += 1;
        }
        if (happy == 0 && sad == 0) System.out.println("none");
        else if (happy == sad) System.out.println("unsure");
        else if (happy > sad) System.out.println("happy");
        else System.out.println("sad");
    }
}

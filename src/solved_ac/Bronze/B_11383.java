package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11383 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n;
        int m;
        int i;

        String str1;
        String str2;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        str1 = str2 = "";
        for (i = 0; i < n; i++){
            str1 = str1 + br.readLine();
        }
        for (i = 0; i < n; i++) {
            str2 = str2 + br.readLine();
        }
        boolean check = false;
        for (i = 0; i < n * m * 2; i++){
            if (str2.charAt(i) != str1.charAt(i / 2)) {
                check = true;
                break;
            }
            }
        System.out.println(check ? "Not Eyfa" : "Eyfa");
    }
}

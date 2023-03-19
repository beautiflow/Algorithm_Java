package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String word;

        for(int tc = 1; tc <= T; tc++){

            word = br.readLine();
            String[] str = word.split(" ");
            System.out.print("Case #" + tc + ": ");

            for(int i = str.length-1 ; i >= 0 ; i--){
                System.out.print(str[i]+" ");
            }
            System.out.println();

        }

    }
}

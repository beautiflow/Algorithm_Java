package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            char word = str.charAt(i);

            if(Character.isUpperCase(word)){
                System.out.print(String.valueOf(word).toLowerCase());
            }
            if(Character.isLowerCase(word)){
                System.out.print(String.valueOf(word).toUpperCase());
            }
        }

    }
}

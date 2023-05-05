package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_13235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                count++;
            }
        }
        if(count == str.length()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = new String[str.length()];

        for(int i = 0; i < str.length(); i++){
            arr[i] = str.substring(i);
        }

        Arrays.sort(arr);

        for(int i = 0; i < str.length(); i++){
            System.out.println(arr[i]);
        }
    }
}

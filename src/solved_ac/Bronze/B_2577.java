package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int T = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(T);

        for(int i = 0; i < str.length(); i++){
            arr[(str.charAt(i) - 48)]++;
        }

        for(int val : arr){
            System.out.println(val);
        }
    }
}

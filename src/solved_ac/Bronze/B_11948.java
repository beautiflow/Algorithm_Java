package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] science = new int[4];
        for(int i = 0; i < science.length; i++){
            science[i] = Integer.parseInt(br.readLine());
        }
        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        Arrays.sort(science);

        int sumA = 0;
        for(int i = science.length - 1; i > 0; i--){
            sumA += science[i];
        }
        System.out.println(sumA + Math.max(E,F));
    }
}

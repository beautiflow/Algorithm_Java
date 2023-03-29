package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];

        for(int i = 0; i < N; i++){
            weight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(weight);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            max = Math.max(max, weight[i] * (N-i));
        }

        System.out.println(max);
    }
}

package Study.그리디1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int lope[] = new int[N];

        for(int i = 0; i < N; i++){
            lope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lope);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            lope[i] = lope[i] * (N-i);
            if(max < lope[i]){
                max = lope[i];
            }
        }
        System.out.println(max);
    }
}

package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Long[] arr = new Long[10];

        for(int tc = 1; tc <= T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < 10; i++){
                arr[i] = Long.valueOf(Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(arr);

            int sum = 0;
            double result = 0.0;
            for(int i = 1; i < 9; i++){
                sum += arr[i];
            }


            result = sum / (double)8;

            double last = Math.round(result);

            System.out.println("#"+ tc + " " + (int)last);
        }
    }
}

package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int i = 0; i < T; i++){
             st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[10];

            for(int j = 0; j < 10; j++){
                arr[i] = Integer.parseInt(st.nextToken());
                Arrays.sort(arr);
            }

            System.out.println("#" + (i+1)+ " " +arr[arr.length-1]);
        }
    }
}

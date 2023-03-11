package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int[] arr = new int[str.length];

        int mid = N/2;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        System.out.println(arr[mid]);
    }
}

package CNUSW2.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int i = 1;

        for( ; i < N; i++){
            arr[i] = i;
        }

        for(; i <= M; i++){
        int U = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int temp = 0;

        temp = arr[U];
        arr[U] = arr[V];
        arr[V] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}






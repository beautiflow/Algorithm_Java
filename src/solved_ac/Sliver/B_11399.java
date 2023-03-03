package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[1001];

        while (N-- > 0){
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int wait = 0;
        int sum = 0;

        for(int i = 0; i < 1001; i++){

            while(arr[i]-- > 0){
                sum += (i + wait);

                wait += i;
            }
        }
        System.out.println(sum);
    }
}


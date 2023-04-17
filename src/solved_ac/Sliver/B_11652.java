package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];

        for(int i = 0 ; i < N; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        int max = 1;
        int count = 1;
        int maxIndex = 0;
        for(int i = 1; i < N; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                count = 1;
            }

            if(count > max){
                max = count;
                maxIndex = i;
            }

        }
        System.out.println(arr[maxIndex]);
    }
}

package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 1;
        int count2 = 1;
        int max = 1;


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N-1; i++){
            if(arr[i] <= arr[i+1]){
                count++;
            }
            else {
                count = 1;
            }
            max = Math.max(count, max);
        }
        for(int i = 0; i < N-1; i++){
            if(arr[i]>=arr[i+1]){
                count2++;
            }
            else {
                count2 = 1;
            }
            max = Math.max(count2, max);
        }
        System.out.println(max);

    }
}

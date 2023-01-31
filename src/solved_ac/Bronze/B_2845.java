package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int N = L*P;

        st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            System.out.print(arr[i] - N + " ");
        }
    }
}

package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2491_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int countBig = 1;
        int countSmall = 1;
        int max = 1;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N-1; i++){
            if(arr[i] <= arr[i+1]){
                countBig++;
            }
            else {
                countBig = 1;
            }
            max = Math.max(countBig, max);


            if(arr[i] >= arr[i+1]){
                countSmall++;
            }
            else {
                countSmall = 1;
            }
            max = Math.max(countSmall, max);

        }
        System.out.println(max);
    }
}

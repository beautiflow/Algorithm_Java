package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;

        for(int i = 1; i <= N; i++){
            if(N%i == 0){
                count++;
            }
            if(count == K){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

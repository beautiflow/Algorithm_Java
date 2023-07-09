package Study.practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int days = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            long[] stocks = new long[days];
            for(int i = 0; i < days; i++){
                stocks[i] = Long.parseLong(st.nextToken());
            }

            long max = 0;
            long answer = 0;

            for(int i = days-1; i >= 0; i--){
                if(stocks[i] <= max){
                    answer += (max - stocks[i]);
                }
                else{
                    max = stocks[i];
                }
            }
                System.out.println(answer);
        }
    }
}

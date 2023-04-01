package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_9085 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
             N = Integer.parseInt(br.readLine());
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}

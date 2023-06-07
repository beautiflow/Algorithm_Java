package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int winner = 1;
        int total = 0;

        for(int i = 1; i <= 5; i++){
            st = new StringTokenizer(br.readLine());
            int current = 0;
            while (st.hasMoreTokens()){
                current += Integer.parseInt(st.nextToken());
            }

            if(current > total){
                winner = i;
                total = current;
            }
        }
        System.out.println(winner + " " + total);
    }
}

package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int min = 0;
        int man = 0;

        while (st.hasMoreTokens()){
            min += Integer.parseInt(st.nextToken());
    }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            man += Integer.parseInt(st.nextToken());
        }
        System.out.println(Math.max(min, man));
    }
}

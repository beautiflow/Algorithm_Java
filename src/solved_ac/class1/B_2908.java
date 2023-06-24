package solved_ac.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2908 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

       int M = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
       int N = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

       if(M > N){
           System.out.println(M);
       }
       else {
           System.out.println(N);
       }

    }
}

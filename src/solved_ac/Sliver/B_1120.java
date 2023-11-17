package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1120 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        int answer = A.length();

        for(int i = 0; i < B.length() - A.length(); i++){
            int count = 0;
            for(int j = 0; j < A.length(); j++){
                if(A.charAt(j) != B.charAt(j+1)){
                    count++;
                }
            }
            answer = Math.min(count, answer);
        }
        System.out.println(answer);

    }
}

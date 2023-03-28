package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> memo = new HashMap<>();

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            String domain = st.nextToken();
            String password = st.nextToken();
            memo.put(domain, password);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            String input = br.readLine();
            sb.append(memo.get(input)).append("\n");
        }

        System.out.println(sb);
    }
}

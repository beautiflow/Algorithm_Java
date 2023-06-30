package Study.learnzip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_11098 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());
            int max = 0;

            HashMap<Integer, String> list =  new HashMap<>();

            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                int money = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                list.put(money, name);
                max = Math.max(max, money);
            }
            System.out.println(list.get(max));
        }
    }
}

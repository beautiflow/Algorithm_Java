package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B_14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet set = new HashSet();

        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < M; i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}

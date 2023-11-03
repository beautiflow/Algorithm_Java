package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1592_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int move = Integer.parseInt(st.nextToken());
        int totalThrow = 0;
        int index = 1;

        int[] friedns = new int[N+1];
        friedns[1] = 1;

        while (true){

            if(friedns[index] == M){
                break;
            }

            if(friedns[index]%2 != 0){
                index = index+move;
                if(index > N){
                    index=index%N;
                }
                friedns[index]++;
            }
            else {
                index = index-move;
                if(index < 1){
                    index=index+N;
                }
                friedns[index]++;
            }
            totalThrow++;
        }

        System.out.println(totalThrow);

    }
}

package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2476 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int max = 0;

        for(int i = 0; i < N; i++){
            int money = 0;
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if(A == B && B == C){
                money = 10000 + (A*1000);
            }
            else if (A != B && B != C && C != A) {
                money = Math.max(A, Math.max(B, C))*100;
            }
            else {
                if(A == B){
                    money = 1000 + (A*100);
                }
                else if(B == C){
                    money = 1000 + (B*100);
                }
                else {
                    money = 1000 + (C*100);
                }
            }
            if(money > max){
                max = money;
            }
        }
        System.out.println(max);
    }
}

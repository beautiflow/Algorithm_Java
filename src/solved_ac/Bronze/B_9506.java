package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_9506 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            int sum = 0;

            while(N != -1){
                sb.setLength(0);
                sb.append(N + " = 1");
                sum = 1;

                for(int i = 2; i < N; i++){
                    if(N % i == 0){
                        sb.append(" + "+i);
                        sum += i;
                    }
                }
                if(sum == N){
                    System.out.println(sb);
                }
                else{
                    System.out.println(N + " is NOT perfect.");
                }
                N = Integer.parseInt(br.readLine());
            }
        }
    }


package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int[] cardA = new int[5];

            for (int i = 0; i < A; i++) {
                cardA[Integer.parseInt(st.nextToken())]++;
            }

            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int[] cardB = new int[5];

            for (int i = 0; i < B; i++) {
                cardB[Integer.parseInt(st.nextToken())]++;
            }

            for(int i = 4; i >0; i--){
                if(i == 1 && cardA[i] == cardB[i]){
                    System.out.println("D");
                    break;
                }
                if(cardA[i] == cardB[i]){
                    continue;
                }
                if(cardA[i] > cardB[i]){
                    System.out.println("A");
                    break;
                }
                if(cardA[i] < cardB[i]){
                    System.out.println("B");
                    break;
                }
            }
        }
    }
}

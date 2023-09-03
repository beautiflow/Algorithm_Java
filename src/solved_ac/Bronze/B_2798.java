package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] card = new int[N];
        int max = Integer.MIN_VALUE;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        for(int i = N-1; i >= 2; i--){
            for(int j = i-1; j >= 1; j--){
                for(int k = j-1; k >=0; k--){
                    sum = card[i] + card[j] + card[k];
                    if(M >= sum){
                        max = Integer.max(max, sum);
                        //System.out.println("sum = "+sum);
//                        return;

//                        System.out.println("sum  = " + sum + " ");
//                        System.out.println("card[i]  card[j]  card[k]" + card[i] +" " + card[j]+" " + card[k]);
//                        System.out.println("max = "+max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}

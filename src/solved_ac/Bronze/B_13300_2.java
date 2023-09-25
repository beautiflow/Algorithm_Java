package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13300_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] boys = new int[7];
        int[] girls = new int[7];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(S == 1){
                boys[Y] += 1;
            }
            else {
                girls[Y] += 1;
            }
        }

        int bCnt = 0;
        int gCnt = 0;

        for(int i = 1; i < boys.length; i++){
            if(boys[i]%K==0){
                bCnt += boys[i]/K;
            }
            else {
                bCnt += boys[i]/K + 1;
            }
        }

        for(int i = 1; i < girls.length; i++){
            if(girls[i]%K==0){
                gCnt += girls[i]/K;
            }
            else {
                gCnt += girls[i]/K + 1;
            }
        }
        System.out.println(bCnt+gCnt);
    }
}

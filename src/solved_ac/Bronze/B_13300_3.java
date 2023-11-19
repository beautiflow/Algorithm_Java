package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_13300_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int MBan = 0;
        int WBan = 0;

        int[] boys = new int[7];
        int[] girls = new int[7];

        for(int i = 1; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int MW = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            if(MW == 1){
                boys[grade]++;
            } else if (MW == 0) {
                girls[grade]++;
            }
        }

        for(int i = 1; i < boys.length; i++){
            if(boys[i]%limit==0){
                MBan += boys[i]/limit;
            }
            else {
                MBan += boys[i]/limit+1;
            }

        }

        for(int i = 1; i < girls.length; i++){
        if(girls[i]%limit==0){
            WBan += girls[i]/limit;
        }
        else {
            WBan += girls[i]/limit+1;
        }
        }


        System.out.println(MBan+WBan);

    }
}



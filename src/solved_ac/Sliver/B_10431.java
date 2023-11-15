package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10431 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine());


            int Tnum = Integer.parseInt(st.nextToken());
            int count = 0;
            int[] students = new int[20];

            for(int i = 0; i < 20; i++){
                students[i] = Integer.parseInt(st.nextToken());
            }

            // 앞사람이 뒷사람보다 큰 경우
            for(int i = 0; i < 20; i++){
                for(int j = 0; j < i; j++){
                    if(students[j] > students[i]){
                        count++;
                    }
                }
            }
            System.out.println(tc+" "+count);

        }

    }
}

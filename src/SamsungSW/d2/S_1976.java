package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int hour = H+h;
            int minute = M+m;

            if(hour > 12){
                hour = hour%12;
            }
            if(minute > 60){
                hour++;
                minute = minute%60;
            } else if (minute == 60) {
                hour++;
                minute = minute%60;
            }
            System.out.println("#"+tc+" "+ hour+" " + minute);
        }
    }
}

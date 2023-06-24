package SamsungSW.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_ssafy1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int tempX = 0;
        int tempY = 0;
        int LeftY = 0;
        int RightY = 0;

        for(int i = 1; i <= P; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(tempX <= x){
                tempX = x-1;
            }

            if(N/y <= y){
                LeftY = Math.max(LeftY, y)-1;
            }
            if (N/y > y) {
                RightY = Math.max(RightY, N-y);
            }
            tempY = Math.min(LeftY, RightY);
        }
        System.out.println(tempX+tempY);
    }
}

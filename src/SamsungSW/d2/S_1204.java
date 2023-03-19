package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int num =Integer.parseInt(br.readLine());
           int[] count = new int[101];

           int max = 0;
           int result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
           int score = 0;
           for(int i = 0 ; i < 1000; i++){
               score = Integer.parseInt(st.nextToken());
               count[score]++;
           }

           for(int i = 0; i < 101; i++){
               if(max <= count[i]){
                   max = count[i];
                   result = i;
                   }
               }
            System.out.println("#" + tc + " " + result);
           }
        }
    }

